package com.bipin.ninja.code.linkedlist;

public class FindMiddleOfLinkedList {
	
	public static int getMiddle(Node<Integer> head)
	{
		Node<Integer> slow = head,fast = head;
		
		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	
	public static Node<Integer> getMiddle1(Node<Integer> head)
	{
		Node<Integer> slow = head,fast = head;
		
		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

}
