package com.datastructure;

public class Main {



	public static void main(String[] args) {
		System.out.println("Welcome to DataStructure Program");
		LinkedList linkedList = new LinkedList();
		
		
		LinkedList.Node prevNode = linkedList.insert(56);
    	linkedList.insert(70);
    	
    	linkedList.insertAfter(prevNode,  30);
	
	}
}
