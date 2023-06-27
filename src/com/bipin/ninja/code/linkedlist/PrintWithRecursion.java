package com.bipin.ninja.code.linkedlist;

public class PrintWithRecursion {

	public static void printByRecursion(Node<Integer> head)
	{
		if(head == null)
			return;
		System.out.print(head.data+" ");
		printByRecursion(head.next);
	}
}
