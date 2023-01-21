package datastructures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StackTest
{
  @Test void testAMethod()
    {
    Stack sut =  new Stack();
    sut.push( 3);
    assertEquals("{3} -> NULL", sut.toString());
    }
  @Test void testAMethod2()
  {
    Stack sut =  new Stack();
    sut.push( 3);
    sut.push( 5);
    sut.push( 3);
    assertEquals("{3} ->{5} ->{3} -> NULL", sut.toString());
  }

}
