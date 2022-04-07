package com.Bridglabz;

public class LinkedListMain 
{
  public static void main(String[] args) {
	  LinkedList<Integer> list=new LinkedList<>();
      list.add(23);
      list.add(45);
      list.add(19);
      list.add(89);
      list.insertAtLast(57);
      list.insertAtPosition(2,11);
      list.deleteFirst();
      list.deleteLast();
      list.deleteAtPosition(2);
      list.search(19);
      list.getSize();
      list.printList();
      
	}
  }

