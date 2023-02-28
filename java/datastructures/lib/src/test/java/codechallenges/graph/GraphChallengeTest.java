package codechallenges.graph;


import org.junit.jupiter.api.Test;

import codechallenges.graph.Edge;
import codechallenges.graph.Graph;
import codechallenges.graph.Vertex;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;
public class GraphChallengeTest{
@Test
void addNodeAndGetNodeTest() {
  Graph<String> sut = new Graph<>(6);
  sut.addVertex("Alpha");
  LinkedList testLL = sut.getVertices();
  LinkedList testNeighbor = sut.getNeighbors(new Vertex<>("1"));
  assertTrue(sut.getVertices() != null);
  assertEquals(1, sut.size());
}
  @Test
  void testAssertGraphExists() {
    Graph<String> sut = new Graph<>(6);
    Vertex<String> temp1 = sut.addVertex("a");
    Vertex<String> temp2 = sut.addVertex("b");
    Vertex<String> temp3 = sut.addVertex("c");
    Vertex<String> temp4 = sut.addVertex("d");
    Vertex<String> temp5 = sut.addVertex("e");
    Vertex<String> temp6 = sut.addVertex("f");
    sut.addEdge(temp1, temp2);
    sut.addEdge(temp2, temp1);

    sut.addEdge(temp2,temp3);
    sut.addEdge(temp3,temp2);

    sut.addEdge(temp2,temp5);
    sut.addEdge(temp5,temp2);

    sut.addEdge(temp3,temp4);
    sut.addEdge(temp4,temp3);

    sut.addEdge(temp3,temp5);
    sut.addEdge(temp5,temp3);

    sut.addEdge(temp3,temp6);
    sut.addEdge(temp6,temp3);

    sut.addEdge(temp4,temp6);
    sut.addEdge(temp6,temp4);

    sut.addEdge(temp5,temp6);
    sut.addEdge(temp6,temp5);
    assertNotNull(sut.toString());
  }

}

