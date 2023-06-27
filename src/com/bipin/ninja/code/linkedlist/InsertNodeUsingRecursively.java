package com.bipin.ninja.code.linkedlist;

public class InsertNodeUsingRecursively {

	public static Node<Integer> insert(Node<Integer> head, int pos, int ele) {
		if (pos == 0) {
			Node<Integer> newNode = new Node<Integer>(ele);
			newNode.next = head;
			return newNode;
		}
		if(head == null)
			return head;

		head.next = insert(head.next, pos-1, ele);
		return head;
	}

}
