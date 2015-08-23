package graph.components;

/**
 * The status of each vertex in a BFS. 
 * @author Rahul
 */
public enum VertexStatus 
{
  /**
  * Implies that all the neighbors of the current vertex have been enqueued, thus there is no need to visit it again.
  */
   VISITED,
   
   /**
    * Implies that all the neighbors of the current vertex have not been visited.
    */
   NOT_VISITED;
}
