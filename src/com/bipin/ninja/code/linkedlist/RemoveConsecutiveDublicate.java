package com.bipin.ninja.code.linkedlist;

import java.util.Scanner;

public class RemoveConsecutiveDublicate {

	public static void main(String[] args) {
		
		Node<Integer> head = getInput();
		print(head);
//		head = removeDuplicates(head);
		head = p1(head);
		print(head);

	}
	
	
	
	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		Node<Integer> t1 = head;
		Node<Integer> t2 = head.next;
		
		while( t2!= null)
		{
			if(t1.data != t2.data)
			{
				t1.next = null;
				t1.next = t2;
				t1 = t2;
				t2 = t2.next;
			}
			else {
				t1.next = null;
				t2 = t2.next;
			}
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
	
	
	public static Node<Integer> p1 (Node<Integer> head)
	{
		if(head == null ) return head ;
		   Node<Integer> t1 = head;
		   while(t1.next != null){
			   if(t1.data.equals(t1.next.data)){
				   t1.next = t1.next.next;
			   }else{
				   t1 = t1.next;
			   }
		   }
		   return head ;
	}

}
