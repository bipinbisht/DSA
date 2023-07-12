package com.bipin.ninja.code.stack;

import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {

		String s = "((((";
		System.out.println(isBalanced(s));
	}

	public static boolean isBalanced(String str) {
		char c = ')';
		if (str.length() % 2 != 0)
			return false;
		if (str.charAt(0) == c)
			return false;
		Stack<Character> s = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (s.size() == 0)
				s.push(str.charAt(i));
			else if (s.peek().equals(str.charAt(i)))
				s.push(str.charAt(i));
			else
				s.pop();
		}
		if (s.size() == 0)
			return true;

		return false;
	}

}
