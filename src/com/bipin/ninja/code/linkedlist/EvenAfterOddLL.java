package com.bipin.ninja.code.linkedlist;

public class EvenAfterOddLL {

	public static Node<Integer> evenAfterOdd(Node<Integer> head) {

		Node<Integer> start = null, end = null, temp = head, first = null, last = null;

		while (temp != null) {
			if (temp.data % 2 == 0) {
				if (end != null) {
					end.next = temp;
					end = temp;
				} else {
					end = temp;
					last = end;
				}
				temp = temp.next;
				end.next = null;
			} else {
				if (start != null) {
					start.next = temp;
					start = temp;
				} else {
					start = temp;
					first = start;
				}
				temp = temp.next;
				start.next = null;
			}
		}
		if(start == null)
			return last;
		
		start.next = last;

		return first;
	}

}
