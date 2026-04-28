package com.example.challenges;

public class LinkedList {
	Node head;
	
	public void pushNode(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void append(int data) {
		
		Node newNode = new Node(data);
		
		if (head == null ) {
			head = newNode;
			return;
		}
		
		Node curr = head;
		
		while (curr.next != null) {
			curr = curr.next;
			
			if (curr.next == null ) {
				curr = curr.next;
			}
		}
		
		curr.next = newNode;
	}
}
