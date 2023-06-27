package com.bipin.ninja.code.linkedlist;

public class ReverseLinkedlistRR {
	
	public static Node<Integer> reverse(Node<Integer>head)
	{
		if(head == null || head.next == null)
		{
			return head;
		}
		
		Node<Integer> finalHead = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return finalHead;
	}

}
