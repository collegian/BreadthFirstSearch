package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import graph.components.Vertex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import bfs.algorithm.BreadthFirstSearch;



public class BFSTest 
{
	 private Vertex r,s,t,u,v,w,x,y = null;
	 private List<Vertex> graph = new ArrayList<>();
	 
	 
	 @Before
	   public void setup()
	   {
		    r =  new Vertex('r');
		    s =  new Vertex('s');
		    t =  new Vertex('t');
		    u =  new Vertex('u');
		    v =  new Vertex('v');
		    w =  new Vertex('w');
		    x =  new Vertex('x');
		    y =  new Vertex('y');
		   
		   graph.add(r);
		   graph.add(s);
		   graph.add(t);
		   graph.add(u);
		   graph.add(v);
		   graph.add(w);
		   graph.add(x);
		   graph.add(y);
		   
		   List<Vertex> rNeighbors = new ArrayList<>();
		   rNeighbors.add(s);
		   rNeighbors.add(v);
		   r.setAdjacencyList(rNeighbors);
		   
		   List<Vertex> sNeighbors = new ArrayList<>();
		   sNeighbors.add(r);
		   sNeighbors.add(w);
		   s.setAdjacencyList(sNeighbors);
		   
		   List<Vertex> tNeighbors = new ArrayList<>();
		   tNeighbors.add(w);
		   tNeighbors.add(x);
		   tNeighbors.add(u);
		   t.setAdjacencyList(tNeighbors);
		   
		   List<Vertex> uNeighbors = new ArrayList<>();
		   uNeighbors.add(t);
		   uNeighbors.add(x);
		   uNeighbors.add(y);
		   u.setAdjacencyList(uNeighbors);
		   
		   List<Vertex> vNeighbors = new ArrayList<>();
		   vNeighbors.add(r);
		   v.setAdjacencyList(vNeighbors);
		   
		   List<Vertex> wNeighbors = new ArrayList<>();
		   wNeighbors.add(s);
		   wNeighbors.add(t);
		   wNeighbors.add(x);
		   w.setAdjacencyList(wNeighbors);
		   
		   List<Vertex> xNeighbors = new ArrayList<>();
		   xNeighbors.add(w);
		   xNeighbors.add(t);
		   xNeighbors.add(u);
		   xNeighbors.add(y);
		   x.setAdjacencyList(xNeighbors);
		   
		   List<Vertex> yNeighbors = new ArrayList<>();
		   yNeighbors.add(u);
		   yNeighbors.add(x);
		   y.setAdjacencyList(yNeighbors);
	   }
	 
	  @Test
	  public void testBFS()
	  {
		BreadthFirstSearch<Vertex> bfs = new BreadthFirstSearch<>();
		bfs.search(s, graph);
		bfs.printPath(s, u);
		bfs.printPath(s, y);
	  }

}
