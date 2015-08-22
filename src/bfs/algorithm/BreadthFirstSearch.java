package bfs.algorithm;

import graph.components.Vertex;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class BreadthFirstSearch<T>
{
	private Queue<T> neighbors;
	
	public void search(Collection<Vertex<T>> vertices)
	{
		for(Vertex<T> vertex:vertices)
		{
			addNeighborsToQueue(vertex);
			break;
		}
		
		Optional<Vertex<T>> currentVertexOptional = neighbors.dequeue();
		if(currentVertexOptional.isPresent())
		{
			Vertex<T> currentVertex= currentVertexOptional.get();
			addNeighborsToQueue(currentVertex);
		}
	}
	
	private void addNeighborsToQueue(Vertex<T> currentVertex)
	{
		List<Vertex<T>> adjacentVertices = currentVertex.getAdjacencyList();
		for(Vertex<T> adjacentVertex:adjacentVertices)
		{
			addNeighborsToQueue(adjacentVertex);
		}
	}
}
