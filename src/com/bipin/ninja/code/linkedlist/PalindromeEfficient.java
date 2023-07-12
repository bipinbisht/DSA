package com.bipin.ninja.code.linkedlist;

public class PalindromeEfficient {

	public static boolean isPalindrome(Node<Integer> head) {
		Node<Integer> middle = FindMiddleOfLinkedList.getMiddle1(head);

		Node<Integer> secondHalf = middle.next;

		secondHalf = ReverseLinkedlistRR.reverse(secondHalf);

		middle.next = null;

		while (head != null && secondHalf != null) {
			if (head.data != secondHalf.data)
				return false;
			head = head.next;
			secondHalf = secondHalf.next;
		}

		return true;
	}
}
