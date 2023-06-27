package com.bipin.ninja.code.linkedlist;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String rev="";
		String data="";
		Node<Integer> head = getInput();
		print(head);
		rev = getReverse(head,rev);
		boolean palindromeCustom = isPalindromeCustom(head, rev);
		System.out.println(palindromeCustom);

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

	public static String getReverse(Node<Integer> root,String rev)
	{
		if(root == null)
			return rev;
		 rev =getReverse(root.next,rev);
		 rev = rev + root.data;
		 return rev;
	}
	public static boolean isPalindromeCustom(Node<Integer> head,String rev) {
		String data = "";
		Node<Integer> temp = head;
		
		while(temp != null) {
			data = data+temp.data;
			temp = temp.next;
		}
		if(data.equals(rev))
			return true;
		return false;
	}
}
