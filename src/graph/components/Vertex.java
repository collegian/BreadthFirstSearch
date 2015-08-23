package graph.components;

import java.util.List;
import java.util.Optional;

public class Vertex<T>
{
   private List<Vertex<T>> adjacencyList;
   private VertexStatus vertexStatus;
   private Vertex<T> parent;
   private int distance;
   
   public Vertex()
   {
	  //Initialize every vertex as not visited during creation.
	  vertexStatus=VertexStatus.NOT_VISITED;
	  distance = Integer.MAX_VALUE;
   }
   
   // TODO: Explore if there is a better way to set these.
   public void setAdjacencyList(List<Vertex<T>> adjacencyList)
   {
	   this.adjacencyList = adjacencyList;
   }
   
   public List<Vertex<T>> getAdjacencyList()
   {
     return adjacencyList;	   
   }

   public VertexStatus getVertexStatus() 
   {
	 return vertexStatus;
   }

    public void setVertexStatus(VertexStatus vertexStatus) 
    {
	  this.vertexStatus = vertexStatus;
    }

	public Optional<Vertex<T>> getParent() 
	{
		return Optional.ofNullable(parent);
	}

	public void setParent(Vertex<T> parent) 
	{
		this.parent = parent;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
}
