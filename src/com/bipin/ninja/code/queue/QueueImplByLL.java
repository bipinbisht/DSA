package com.bipin.ninja.code.queue;

import com.bipin.ninja.code.linkedlist.Node;

public class QueueImplByLL<T> {

	// Define the data members
	Node<T> head, tail;
	int front;
	int rear;
	int size;

	public QueueImplByLL() {
		head = null;
		tail = null;
		front = -1;
		rear = -1;
		size = 0;
	}

	/*----------------- Public Functions of Stack -----------------*/

	public int getSize() {

		// Implement the getSize() function
		return size;
	}

	public boolean isEmpty() {

		return (size == 0);
	}

	public void enqueue(T data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
			front++;
			rear++;
			size++;
			return;
		}
		tail.next = node;
		tail = node;
		rear++;
		size++;

	}

	public T dequeue() {
		// Implement the dequeue() function
		if (head == null || size == 0)
			return null;
		T tempData = (T) head.data;
		head = head.next;
		front++;
		size--;
		return tempData;
	}

	public int front() {
		// Implement the front() function
		if (head == null)
			return -1;
		return (int) head.data;
	}

}
