package com.datastructure;

public class Main {



	public static void main(String[] args) {
		System.out.println("Welcome to DataStructure Program");
		LinkedList linkedList = new LinkedList();
		
		linkedList.insert(56);
    	linkedList.insert(30);
    	linkedList.insert(70);
    	int pop = linkedList.pop();
    	System.out.println(pop);
    	linkedList.print();
	}
}
