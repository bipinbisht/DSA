package com.bipin.ninja.code.linkedlist;

import java.util.*;

public class PrintListForIndexing {

	public static void main(String[] args) {

		Node<Integer> head = getInput();
		print(head);
//		head = insert(head, 77, 0);
//		head = deleteList(head, 3);
//		print(head);
//		printIthNode(head, 4);

	}

	static Node<Integer> getInput() {

		Node<Integer> head = null;
		Node<Integer> tail = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list");
		int data = sc.nextInt();
		while (data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if (head == null) {

				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = sc.nextInt();

		}
		return head;
	}

	static void print(Node<Integer> head) {

		Node<Integer> temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void printIthNode(Node<Integer> head, int i) {

		if (i >= head.size)
			return;
		Node<Integer> temp = head;
		int count = 0;

		while (count <= i && temp != null) {

			if (count == i) {
				System.out.print(temp.data);
				return;
			}
			count++;
			temp = temp.next;

		}

	}

	public static Node<Integer> insert(Node<Integer> head, int data, int pos) {

		Node<Integer> newNode = new Node<Integer>(data);
		if (pos == 0) {
			newNode.next = head;
			return newNode;
		}
		int c = 0;
		Node<Integer> temp = head;

		while (c < pos - 1) {
			temp = temp.next;
			c++;
		}

		newNode.next = temp.next;
		temp.next = newNode;
		return head;

	}

	static Node<Integer> deleteList(Node<Integer> head, int pos) {
		if (pos == 0) {
			head = head.next;
			return head;
		}
		Node<Integer> temp = head;
		int c = 0;
		while (temp != null && c < pos - 1) {
			temp = temp.next;
			c++;
		}
		temp.next = temp.next.next;
		return head;
	}

	static int getSize(Node<Integer> head) {

		Node<Integer> temp = head;
		int c = 0;
		while (temp != null) {
			temp = temp.next;
			c++;
		}
		return c;
	}
}
