package com.example.challenges;

public class LinkedList {
	Node head;
	
	public void pushNode(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
}
