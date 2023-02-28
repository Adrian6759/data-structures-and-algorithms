package codechallenges.linkedlist;

import datastructures.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListChallengesTest
{
  @Test
  void testAChallenge()
  {
    LinkedListChallenges sut = new LinkedListChallenges();
    sut.linkedListChallenge06();
    System.out.println("test something here");
    assertTrue(true);
  }
  @Test void testAppend(){
    LinkedList sut = new LinkedList();
    sut.insert(1);
    sut.insert(2);
    sut.insert(3);
    sut.append(5);
    assertEquals("{3} -> {2} -> {1} -> {5} -> NULL", sut.toString());

  }
  @Test void testInsertBefore(){
    LinkedList sut = new LinkedList();
    sut.insert(1);
    sut.insert(2);
    sut.insert(4);
    sut.insertBefore(4, 3);
    assertEquals("{3} -> {4} -> {2} -> {1} -> NULL", sut.toString());

  }
  @Test void testInsertAfter(){
    LinkedList sut = new LinkedList();
    sut.insert(1);
    sut.insert(2);
    sut.insert(4);
    sut.insertAfter(4, 3);
    assertEquals("{4} -> {3} -> {2} -> {1} -> NULL", sut.toString());

  }
}
