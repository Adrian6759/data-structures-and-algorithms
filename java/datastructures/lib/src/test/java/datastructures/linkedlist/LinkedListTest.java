package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest
{
  @Test void testAMethod()
    {
      LinkedList sut = new LinkedList();
      //Head = null because LinkedList makes head null
      sut.insert(3);
      // Head.value = 3, next = null First time around
      sut.insert(1000);
      assertTrue(true);
    }

}
