package com.bipin.ninja.code.linkedlist;

public class StackUse {

	public static void main(String[] args) {

		StackUsingLL<Integer> s = new StackUsingLL<>();
		s.push(20);
		s.push(30);
		System.out.println(s.size());
		System.out.println(s.top());
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.size());
		System.out.println(s.top());
		s.push(3);
		System.out.println(s.top());
		System.out.println(s.size());
		
	}

}
