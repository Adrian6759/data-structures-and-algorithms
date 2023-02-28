package codechallenges.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import codechallenges.graph.Edge;
import codechallenges.graph.Vertex;



public class Graph<T extends Comparable<? super T>> implements Comparable<Graph<T>>  // just in case you have Comparable data structures
{
  HashMap<Vertex<T>, LinkedList<Edge<T>>> hashMap = new HashMap<>();
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
  LinkedList<Edge<T>> linkedList = new LinkedList();
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
    LinkedList<Edge<T>> linkedList = new LinkedList();
    hashMap.get(start);
    linkedList.add(newEdge);
    hashMap.put(new Vertex<>(start.value),linkedList);
  }

  public LinkedList<Vertex<T>> getVertices()  // getNodes()
  {
    LinkedList<Vertex<T>> temp = new LinkedList<>(hashMap.keySet());

    return temp;
  }

  public LinkedList<Edge<T>> getNeighbors(Vertex<T> vertex) {

    return hashMap.get(vertex);
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
//    for(Map.Entry<Vertex<T>, LinkedList<Edge<T>>> element :hashMap.entrySet()){
//
//    }
