package com.kiddy.dataStructure;

public class SinglyLinkedListStack<T> {

	/*
	 * Stack with Singly Linked List
	 * @Author LwinPhyoAung(codeCat)
	 * 
	 * Methods :	push(T element) :
	 * 				pop() : T
	 * 				top() : T
	 * 
	 * 				isEmpty() : boolean
	 * 				size() : int
	 */
	
	class Node{
		
		T data;
		Node next;
		
		Node(T data){
			this.data = data;
		}
		
	}
	
	private int counter = 0;
	
	private Node top;
	
	public SinglyLinkedListStack(){
		
	}
	
	public void push(T element){
		
		Node newNode = new Node(element);
		
		counter += 1;
		
		if(isEmpty()){
			// empty stack
			top = newNode;
			return;
		}
		
		// add new		
		newNode.next = top;
		
		top = newNode;
		
	}
	
	public T pop(){
		
		Node temp = top;
		
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return null;
		}
		
		top = top.next;
		counter -= 1;
		return temp.data;
		
	}
	
	public T top(){
		
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return null;
		}
		
		return top.data;
		
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public int size(){
		return counter;
	}
	
}
