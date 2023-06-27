package com.bipin.ninja.code.linkedlist;

public class DeleteRecursively {
	
	public static Node<Integer> delete(Node<Integer> head,int pos)
	{
		Node<Integer> t = head;
		int c =0;
		if(pos == 0)
		{
			head = head.next;
			return head;
		}
		if(head == null)
			return head;
		
		while(t != null)
		{
			c++;
			t = t.next;
		}
		if(pos>=c)
			return head;
		
		
		
		
		head.next = delete(head.next, pos-1);
		return head;
	}

}
