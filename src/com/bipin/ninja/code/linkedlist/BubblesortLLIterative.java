package com.bipin.ninja.code.linkedlist;

public class BubblesortLLIterative {

	public static Node<Integer> bubbleSort(Node<Integer> head) {
		Node<Integer> i = head;

		while (i != null) {
			Node<Integer> j = i.next;
			while (j != null) {
				if (i.data > j.data) {
					int t = i.data;
					i.data = j.data;
					j.data = t;
				}
				j = j.next;
			}
			i = i.next;
		}
		return head;
	}
}
