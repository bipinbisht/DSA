package com.bipin.ninja.code.linkedlist;

import java.util.Scanner;

public class RotateLinkedListByN {

	public static void main(String[] args) {
	
		Node<Integer> head = getInput();
		print(head);
		head = appendLastNToFirst(head, 3);
		print(head);

	}
	
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		Node<Integer> tail = head;
		int size = getSize(head);
		
		int i =1;
		while(i<size-n)
		{
			tail = tail.next;
			i++;
		}
		Node<Integer> newHead = tail.next;
		
		tail.next = null;
		tail = newHead;
		int j =1;
		while( j<n)
		{
			tail = tail.next;
			j++;
		}
		tail.next = head;
		head = newHead;
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
}
