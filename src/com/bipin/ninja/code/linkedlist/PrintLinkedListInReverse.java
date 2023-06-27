package com.bipin.ninja.code.linkedlist;

import java.util.Scanner;

public class PrintLinkedListInReverse {

	public static void main(String[] args) {

		Node<Integer> head = getInput();
		print(head);
//		printReverse(head);
		printReverse1(head);
	}

	static void print(Node<Integer> head) {

		Node<Integer> temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
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

	static int getSize(Node<Integer> head) {

		Node<Integer> temp = head;
		int c = 0;
		while (temp != null) {
			temp = temp.next;
			c++;
		}
		return c;
	}

	public static void printReverse(Node<Integer> root) {
		if (root == null)
			return;

		int size = getSize(root);

		Node<Integer> temp = root;
		for (int i = size - 2; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {

				temp = temp.next;
			}
			System.out.print(temp.data+" ");
			temp = root;
		}
		
		System.out.print(root.data);

	}

	public static void printReverse1(Node<Integer> root)
	{
		if(root == null)
			return;
		
		printReverse1(root.next);
		System.out.print(root.data+" ");
	}
}
