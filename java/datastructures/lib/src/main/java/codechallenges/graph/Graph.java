package codechallenges.graph;

import java.util.HashMap;
import java.util.LinkedList;

import codechallenges.graph.Edge;
import codechallenges.graph.Vertex;



public class Graph<T extends Comparable<? super T>> implements Comparable<Graph<T>>  // just in case you have Comparable data structures
{
  HashMap hashMap = new HashMap<>();
  public HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
  private int numberOfVertices = 0;

  public Graph(int maxNumberOfVertices)
  {
    adjacencyLists = new HashMap<>(maxNumberOfVertices);
  }

  public Vertex<T> addVertex(T value)  // addNode()
  {
    Vertex newVertex = new Vertex(value);
  Edge<T> edge = new Edge<T>(new Vertex<>(value), 0);
  LinkedList<Edge> linkedList = new LinkedList();
  linkedList.add(edge);
    hashMap.put(newVertex, linkedList);
    numberOfVertices += 1;
    return newVertex;
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination)
  {
    addEdge(start, destination, 0);
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination, int weight)
  {
    Edge newEdge = new Edge(destination, 0);
//    HashMap.get(start, 0);
//    linkedList.add(newEdge);
//    HashMap.put(start, linkedList);
  }

  public LinkedList<Vertex<T>> getVertices()  // getNodes()
  {
//    return HashMap.keySet();
    return null;
  }

  public LinkedList<Edge<T>> getNeighbors(Vertex<T> vertex)
  {

//    return HashMap.get(vertex);
    return null;
  }

  public int size()
  {
    return numberOfVertices;  // TODO: make sure this gets updated at the right times
  }

  @Override
  public int compareTo(Graph<T> o)
  {
    throw new UnsupportedOperationException("Graph does not implement compareTo()");
  }

  @Override
  public String toString()
  {
    // Good for testing
    // WARNING: Your HashMap does not guarantee ordering!
    // But you can basically rely on it if you add nodes to your graphs in a consistent way
    return hashMap.toString();

  }

}
