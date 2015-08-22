package bfs.algorithm;

import graph.components.Vertex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * List based implementation of the queue data structure.
 * @author Rahul Choubey
 */
public class Queue<T>
{
	private List<Vertex<T>> vertices=Collections.emptyList();
	
	public void enqueue(Vertex<T> vertex)
	{
		if(vertices.isEmpty())
		{
			vertices = new ArrayList<>();
		}
		vertices.add(vertex);
	}
	
	public Optional<Vertex<T>> dequeue()
	{
		return Optional.ofNullable(vertices.remove(0));
	}
	
	public boolean isQueueEmpty()
	{
		if(vertices.isEmpty())
		{
			return true;
		}
		
		return false;
	}
}
