package codechallenges.stackqueuebrackets;

import datastructures.stack.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackQueueBracketsTest
{
  @Test
  void testAChallenge()
  {
    Stack<Character> sut = new Stack();
    sut.validate();
    System.out.println("It's valid");
    assertTrue(sut.isEmpty());
  }
}
