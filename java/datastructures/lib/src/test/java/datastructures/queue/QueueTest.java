package datastructures.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class QueueTest
{
  @Test void testAMethod()
    {
      Queue<Integer> sut = new Queue();
      assertThrows(NullPointerException.class, ()->sut.peek());
    }
  @Test void enqueueTest() {
    //arrange
    Queue<Integer> sut = new Queue();
    //Act
    sut.enqueue(5);
    //Assert
    assertEquals(sut.peek(), 5);
  }

  @Test void enqueueDequeueTest(){
    //Arrange
    Queue<Integer> sut = new Queue();
    sut.enqueue(5);
    sut.enqueue(7);
    sut.enqueue(8);
    //Act
    Integer firstVal = (Integer) sut.dequeue();
    Integer secondVal = (Integer) sut.dequeue();
    Integer thirdVal = (Integer) sut.dequeue();
    //Assert
    assertEquals(firstVal, 5);
    assertEquals(secondVal, 7);
    assertEquals(thirdVal, 8);
    assertTrue(sut.isEmpty());
  }
}
