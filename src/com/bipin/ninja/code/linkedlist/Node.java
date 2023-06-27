package com.bipin.ninja.code.linkedlist;

public class Node<T> {
	
	T data;
	Node<T> next;
	static int size =0;
	
	public Node(T data) {
		size++;
		this.data = data;
		next = null;
	}

}
