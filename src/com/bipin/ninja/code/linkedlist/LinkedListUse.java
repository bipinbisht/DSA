package com.bipin.ninja.code.linkedlist;

import java.util.Scanner;



public class LinkedListUse {

	public static void main(String[] args) {
		Node<Integer> head = getInput();
		print(head);
		Node<Integer> reverse = BubblesortLLIterative.bubbleSort(head);
		print(reverse);
	
//36 42 18 8 20 

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

}
