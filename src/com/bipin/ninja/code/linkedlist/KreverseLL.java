package com.bipin.ninja.code.linkedlist;

public class KreverseLL {

	public static MyNode reverse(Node<Integer> head) {
		Node<Integer> curr = head, prev = null;

		while (curr != null) {
			Node<Integer> next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		KreverseLL k = new KreverseLL();
		MyNode node = k.new MyNode();
		node.newHead = prev;
		node.tail = head;
		return node;
	}

	private class MyNode {
		Node<Integer> newHead;
		Node<Integer> tail;
	}

	public static Node<Integer> kReverse(Node<Integer> head, int k) {
		if ( k== 0)
			return head;
		if (head == null)
			return head;

		int count = 0;
		Node<Integer> t1 = head, h1 = head;
		while (count != k - 1 && t1.next != null) {
			t1 = t1.next;
			count++;
		}

		Node<Integer> h2 = t1.next;
		t1.next = null;

		MyNode node = reverse(h1);

		Node<Integer> tail = node.tail, newHead = node.newHead;
		tail.next = kReverse(h2, k);
		return newHead;

	}

	
	
	public static Node<Integer> KreverseShort(Node<Integer> head,int k)
	{
		if(k==0 || k==1)
			return head;
		Node<Integer> curr = head,next = null,prev = null;
		
		int c=0;
		
//		Reverse first k nodes of linked list
		while(c<k && curr != null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			c++;
		}
		if(next != null)
		{
			head.next = KreverseShort(next, k);
		}
		return prev;
	}
}
