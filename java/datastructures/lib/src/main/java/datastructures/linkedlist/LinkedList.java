package datastructures.linkedlist;

import datastructures.linkedlist.Node;

public class LinkedList {
  public Node head = null;

  //CODE CHALLENGE 6
  public void insert(int value) {

    if (head == null) {
      //First time
      head = new Node(value);
    } else {
      //Every other time besides first time
      Node temp = new Node(value);
      temp.next = head;
      head = temp;
    }
  }

  public boolean includes(int value) {
    Node curr = head;
    while (curr != null) {
//       If logic
      if (curr.value == value) {
        return true;
      } else {
        curr = curr.next;
      }
    }
    return false;  // TODO: implement me
  }

  @Override
  public String toString() {
    Node curr = head;
    String outputString = "";
    while (curr != null) {
      outputString += "{" + curr.value + "}->";
    }
    outputString += "Null";

    return outputString;
  }

  //CODE CHALLENGE 7
  public void append(int value) {
    Node newNode = new Node(value);
    if (head != null) {
      Node temp;
      temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    } else {
      head = newNode;
    }
  }

  public void insertBefore(int value, int newValue) {
    Node temp = head;
    Node prev = null;
    if (head != null) {
      while (temp != null) {
        if (temp.value == value) {
          Node before = new Node(newValue);
          before.next = temp;

          if (prev != null) {
            prev.next = before;
          } else {
            head = before;
          }
          return;
        }
      }
      prev = temp;
      temp = temp.next;
    }
  }

  public void insertAfter(int value, int newVal) {
    Node newNode = new Node(value);
    Node temp = head;
    while (temp != null) {
      if (temp.value == value) {
        newNode.next = temp.next;
        temp.next = newNode;
      }
      temp = temp.next;
    }
  }

//LAB 08 Code Challenge
}



