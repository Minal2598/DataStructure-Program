package com.datastructure;

public class LinkedList {
	//head of list
	Node head;	 
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null; //by default object value is null
		}
	}
	
	// This is inert (Append) method
	public Node insert(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return newNode;
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode .next = head;
		head = newNode;
			
		
	}
       
	// Additional data put in betn previous data
	
	public void insertAfter(Node prevNode, int value) {
		if (prevNode == null) {
			System.out.println("Prev Node should not be null");
			return;
			}
			
			Node newNode = new Node(value);
			newNode.next = prevNode.next;
			prevNode.next = newNode;

			print();
		
	}
	
	//Delete first element
	public int pop() {
		int popData = 0;
		if (head == null) {
			System.out.println("Stack over flow ");
		}
		popData = head.data;
		head = head.next;
		
		return popData;
	}
	

	// print the output
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data +  "-> ");
			temp = temp.next;
		}
}
	public int search(int value) {
		if (head == null) {
		System.out.println("List is Empty");
		return -1;
		}
		int index = 1;
		Node tempNode = head;
		while (tempNode != null) {
		if (tempNode.data == value) {
		break;
		}
		index++;
		tempNode = tempNode.next;
		}
		return index;
		}
	
		
	
}
	