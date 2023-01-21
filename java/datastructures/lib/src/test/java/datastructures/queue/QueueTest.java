package datastructures.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class QueueTest
{
  @Test void testAMethod()
    {
      Queue sut = new Queue();
      assertThrows(NullPointerException.class, ()->sut.peek());
    }

}
