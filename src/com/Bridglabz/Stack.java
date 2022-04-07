package com.Bridglabz;

public class Stack<K>
{
	private final LinkedList linkedList;
	 public Stack() {
	 linkedList=new LinkedList();
	 }
	 public void isEmpty(){
	  linkedList.isEmpty();
	  }
	  public void getSize(){
	  linkedList.getSize();
	  }
	 public void push(int data) {
		 linkedList.add(data);
	 }
	 public void printStack() {
		 linkedList.printList();
	 }
	 public Node peak() {
		return linkedList.head;
	 }
	 public void pop()
	 {
		 linkedList.deleteFirst();
	 }
}
