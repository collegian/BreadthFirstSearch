package bfs.algorithm;

import graph.components.Vertex;
import graph.components.VertexStatus;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * Breadth First Search explores all the neighbors of a given vertex before moving to the next vertex.
 * It proceeds by initially marking all nodes as not visited and marking them as visited when their neighbors 
 * have been enqueued.
 */
public class BreadthFirstSearch<T>
{
	private Queue<T> neighbors;
	
	/**
	 * Performs breadth first search.
	 * @param source The source vertex from where the BFS proceeds.
	 * @param vertices The Collection of vertices forming the graph.
	 */
	public void search(Vertex<T> source,Collection<Vertex<T>> vertices)
	{
		source.setDistance(0);
		addNeighborsToQueue(source);
		source.setVertexStatus(VertexStatus.VISITED);
		
		Optional<Vertex<T>> currentVertexOptional = neighbors.dequeue();
		if(currentVertexOptional.isPresent())
		{
			Vertex<T> currentVertex= currentVertexOptional.get();
			currentVertex.setVertexStatus(VertexStatus.VISITED);
			addNeighborsToQueue(currentVertex);
		}
	}
	
	private void addNeighborsToQueue(Vertex<T> currentVertex)
	{
		List<Vertex<T>> adjacentVertices = currentVertex.getAdjacencyList();
		for(Vertex<T> adjacentVertex:adjacentVertices)
		{
			if(adjacentVertex.getVertexStatus()==VertexStatus.NOT_VISITED)
			{
			   adjacentVertex.setParent(currentVertex);
			   adjacentVertex.setDistance(currentVertex.getDistance()+1);
			   neighbors.enqueue(adjacentVertex);
			}
		}
	}
	
	public void printPath(Vertex<T> source, Vertex<T> destination)
	{
		if(source==destination)
		{
			System.out.println(source);
		}
		else if(!destination.getParent().isPresent())
		{
			System.out.println("No path found from source to destination");	
		}
		else 
	    {
			printPath(source,destination.getParent().get());
		    System.out.println(destination);
		 }
	}
}
