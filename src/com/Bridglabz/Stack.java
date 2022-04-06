package com.Bridglabz;

public class Stack 
{
	private final LinkedList linkedList;
	 public Stack() {
	 linkedList=new LinkedList();
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
