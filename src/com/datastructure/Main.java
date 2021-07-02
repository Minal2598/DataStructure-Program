package com.datastructure;

import com.datastructure.LinkedList.Node;

public class Main {
  public static void main(String[] args) {
		System.out.println("Welcome to DataStructure Program");
		LinkedList linkedList = new LinkedList();
	
		linkedList.insert(56);
    	linkedList.insert(30);
    	linkedList.insert(70);
   
    	
    	/*int pop = linkedList.lastPop();
    	System.out.println(pop);*/
    //	linkedList.print();
    	System.out.println("\n");
    	int search = linkedList.search(30);
    	System.out.println("Position of 30::"+search);   	
    	
    	
    	
    	
    	
    	
	}
}
