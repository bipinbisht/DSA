package com.bipin.ninja.code.linkedlist;

public class MergeSortLL {

	public static Node<Integer> mergeSort(Node<Integer> head) {
		if(head == null)
			return head;

		if (head == null || head.next == null)
			return head;

		// split
		Node<Integer> mid = getMid(head);
		Node<Integer> half1 = head;
		Node<Integer> half2 = mid.next;
		mid.next = null;

		half1 = mergeSort(half1);
		half2  = mergeSort(half2);

		return merge(half1,half2);

	}

	public static Node<Integer> getMid(Node<Integer> head) {
		Node<Integer> slow = head, fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
		Node<Integer> head = null, tail = null;

		if (head1.data <= head2.data) {
			head = head1;
			tail = head1;
			head1 = head1.next;
		} else {
			head = head2;
			tail = head2;
			head2 = head2.next;
		}

		while (head1 != null && head2 != null) {
			if (head1.data <= head2.data) {
				tail.next = head1;
				tail = head1;
				head1 = head1.next;
			} else {

				tail.next = head2;
				tail = head2;
				head2 = head2.next;
			}
		}

		if (head1 != null)
			tail.next = head1;
		if (head2 != null)
			tail.next = head2;
		return head;
	}

}
