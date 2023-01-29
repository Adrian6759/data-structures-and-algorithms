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
  }
  public boolean includes(int value)
  { Node curr = head;
    while (curr != null){
//       If logic
      if (curr.value = value){
        return true;
      }else{
        curr = curr.next
      }
    }
    return false;  // TODO: implement me
  }

  @Override
  public String toString()
  { Node curr = head;
    String outputString = "";
    while(curr != null){
      outputString += "{"+curr.value+"}->";
    }
    outputString += "Null";
    
    return outputString;
  }

  public void InsertAtEnd(int value, int newVal)
  {
//    head.next = new Node(value);
//while (curr.value = null)
//      head.next = new Node(value);

}



//LAB 08 Code
}
