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
	public void search(Vertex source,Collection<Vertex> vertices)
	{
		source.setDistance(0);
		neighbors = new Queue<>();
		addNeighborsToQueue(source);
		source.setVertexStatus(VertexStatus.VISITED);
		
		while(!neighbors.isQueueEmpty())
		{
			Optional<Vertex> currentVertexOptional = neighbors.dequeue();
			if(currentVertexOptional.isPresent())
			{
				Vertex currentVertex= currentVertexOptional.get();
				currentVertex.setVertexStatus(VertexStatus.VISITED);
				addNeighborsToQueue(currentVertex);
			}
		}
	}
	
	private void addNeighborsToQueue(Vertex currentVertex)
	{
		List<Vertex> adjacentVertices = currentVertex.getAdjacencyList();
		for(Vertex adjacentVertex:adjacentVertices)
		{
			if(adjacentVertex.getVertexStatus()==VertexStatus.NOT_VISITED)
			{
			   adjacentVertex.setParent(currentVertex);
			   adjacentVertex.setDistance(currentVertex.getDistance()+1);
			   adjacentVertex.setVertexStatus(VertexStatus.EXPLORED);
			   neighbors.enqueue(adjacentVertex);
			}
		}
	}
	
	public void printPath(Vertex source, Vertex destination)
	{
		if(source==destination)
		{
			System.out.println(source.getCharRep());
		}
		else if(!destination.getParent().isPresent())
		{
			System.out.println("No path found from source to destination");	
		}
		else 
	    {
			printPath(source,destination.getParent().get());
		    System.out.println(destination.getCharRep() + " Distance=" + destination.getDistance());
		 }
	}
}
