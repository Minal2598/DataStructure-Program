package com.datastructure;

import com.datastructure.LinkedList.Node;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to DataStructure Program");
		LinkedList linkedList = new LinkedList();

		linkedList.insert(56);
		linkedList.insert(30);
		linkedList.insert(70);

		linkedList.insertAtPos(3, 40);

		linkedList.print();

	}
}
