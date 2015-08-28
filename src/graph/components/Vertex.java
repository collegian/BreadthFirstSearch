package graph.components;

import java.util.List;
import java.util.Optional;

public class Vertex
{
   private List<Vertex> adjacencyList;
   private VertexStatus vertexStatus;
   private Vertex parent;
   private int distance;
   private char charRep;
   
   public Vertex(char charRep)
   {
	  //Initialize every vertex as not visited during creation.
	  vertexStatus=VertexStatus.NOT_VISITED;
	  distance = Integer.MAX_VALUE;
	  this.charRep=charRep;
   }
   
   // TODO: Explore if there is a better way to set these.
   public void setAdjacencyList(List<Vertex> adjacencyList)
   {
	   this.adjacencyList = adjacencyList;
   }
   
   public List<Vertex> getAdjacencyList()
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

	public Optional<Vertex> getParent() 
	{
		return Optional.ofNullable(parent);
	}

	public void setParent(Vertex parent) 
	{
		this.parent = parent;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public char getCharRep() 
	{
		return charRep;
	}
}
