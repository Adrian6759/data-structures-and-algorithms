package datastructures.linkedlist;

import datastructures.linkedlist.Node;

public class LinkedList
{
  public Node head = null;

  public void insert(int value)
  {

    if (head == null){
      //First time
      head = new Node(value);
    }else {
      //Every other time besides first time
      Node temp = new Node(value);
      temp.next = head;
      head = temp;
    }
//head = new Node(value, head);
  }
//  public boolean includes(int value)
//  {
//    while (curr != null){
      // If logic
//      curr = curr.next;
//    }
//    return false;  // TODO: implement me
//  }

  @Override
  public String toString()
  {
    return "null";  // TODO: implement me
  }

  public void InsertAtEnd(int value, int newVal)
  {
    head.next = new Node(value);
while (curr.value = null)
      head.next = new Node(value);

}



//LAB 08 Code
}
