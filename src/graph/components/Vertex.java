package graph.components;

import java.util.List;

public class Vertex<T>
{
   List<Vertex<T>> adjacencyList;
   
   // TODO: Explore if there is a better way to set these.
   public void setAdjacencyList(List<Vertex<T>> adjacencyList)
   {
	   this.adjacencyList = adjacencyList;
   }
   
   public List<Vertex<T>> getAdjacencyList()
   {
     return adjacencyList;	   
   }
}
