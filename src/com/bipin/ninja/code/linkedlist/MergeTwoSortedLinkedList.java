package com.bipin.ninja.code.linkedlist;

public class MergeTwoSortedLinkedList {
	
	public static Node<Integer> merge(Node<Integer>head1 ,Node<Integer>head2)
	{
		if(head1 == null)
			return head2;
		if(head2 == null)
			return head1;
		Node<Integer> t1 = head1, t2 = head2;
		Node<Integer> head3 = null,tail3 = null;
		
		while(t1 != null && t2 != null)
		{
			if(t1.data < t2.data)
			{
				if(tail3 != null)
					tail3.next = t1;
				tail3 = t1;
				if(head3 == null)
					head3 = t1;
				t1 = t1.next;
			}
			
			else
			{
				if(tail3 != null)
					tail3.next = t2;
				tail3 = t2;
				if(head3 == null)
					head3 = t2;
				t2 = t2.next;
			}
			if(t1 == null)
			{
				tail3.next = t2;
			}
			if(t2 == null)
			{
				tail3.next = t1;
			}
		}
		return head3;
	}
	
	public static Node<Integer> merge1(Node<Integer>head1 ,Node<Integer>head2)
	{
		if(head1 == null)
			return head2;
		if(head2 == null)
			return head1;
		Node<Integer> head = null,tail = null;
		
		if(head1.data <= head2.data)
		{
			head = head1;
			tail = head1;
			head1 = head1.next;
		}
		else {
			head = head2;
			tail = head2;
			head2 = head2.next;
		}
		
		while(head1 != null & head2 != null)
		{
			if(head1.data <= head2.data)
			{
				tail.next = head1;
				tail = head1;
				head1 = head1.next;
			}
			else {

				tail.next = head2;
				tail = head2;
				head2 = head2.next;
			}
			
		}
		if(head1 != null)
			tail.next = head1;
		
		if(head != null)
			tail.next = head2;
		
		return head;
	}

}
