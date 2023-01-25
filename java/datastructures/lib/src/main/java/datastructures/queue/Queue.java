package datastructures.queue;

import datastructures.queue.Node;

import java.io.InputStreamReader;

public class Queue<T>
{
  Node<T> front;
  Node<T> back;

  public void enqueue(T valueToEnqueue)
  {
// INPUT <-- value to add to queue (will be wrapped in Node internally)
// OUTPUT <-- none
    Node<T> node = new Node(valueToEnqueue);
    front = node;
    back = node;
  }

  public T dequeue()
  {
// INPUT <-- none
// OUTPUT <-- value of the removed Node
// EXCEPTION if queue is empty

    Node<T> temp = front;
    front = front.next;
    temp.next = null;

    return temp.value;
  }

  public T peek() throws NullPointerException
  {
    if (front == null)
      throw new NullPointerException("Stack is empty");

    return front.value;
  }

  public boolean isEmpty()
  {

    return (front == null);
  }
}
