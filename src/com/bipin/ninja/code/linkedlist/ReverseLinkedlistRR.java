package com.bipin.ninja.code.linkedlist;

public class ReverseLinkedlistRR {
	
	public static Node<Integer> reverse(Node<Integer>head)
	{
		if(head == null || head.next == null)
		{
			return head;
		}
		
		Node<Integer> finalHead = reverse(head.next);
		//head.next refer to tail 
		//head.next.next refer to tail next which we assign to current head for reversing
		//and finally assigning head to null for breaking a link
		head.next.next = head;
		head.next = null;
		return finalHead;
	}

}
