package com.bipin.ninja.code.linkedlist;

public class StackUsingLL<T> {
	
	private Node<T> head;
	private int size;
	
	public StackUsingLL()
	{
		head = null;
		size = 0;
	}
	
	public int size()
	{
		return size;
	}
	
	public T top()
	{
		if(head == null)
		{
			return (T) Integer.valueOf(-1);
		}
		return head.data;
	}
	
	public boolean isEmpty()
	{
		return size() == 0;//head == null
	}
	
	public void push(T ele)
	{
		size++;
		if(head == null)
		{
			Node<T> n = new Node<T>(ele);
			head = n;
			head.next = null;
			return;
		}
		Node<T> temp = head;
		Node<T> n = new Node<T>(ele);
		head = n;
		head.next = temp;
	}
	public void pushNew(T ele)
	{
		Node<T> n = new Node<T>(ele);
		n.next = head;
		head = n;
		size++;
	}
	
	public T pop()
	{
		if(head == null)
			return (T) Integer.valueOf(-1);
		size--;
		Node<T> temp = head;
		T poppedData = temp.data;
		head = head.next;
		temp = null;
		return poppedData;
	}
	
}
