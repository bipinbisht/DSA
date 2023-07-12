package com.bipin.ninja.code.stack;

import java.util.*;

public class CheckRedundantBrackets {

	public static void main(String[] args) {
		String str = "a+(b)+c";
		System.out.println(checkRedundantBrackets(str));
	}
//some test cases are failing
	public static boolean checkRedundantBrackets(String str) {

		Stack<Character> stk = new Stack<>();
		char closing = ')';
		int c = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != closing) {
				stk.push(ch);
			} else {
				while (!stk.isEmpty() && stk.peek() != '(') {
					char poppedItem = stk.pop();
					if (poppedItem != ')' || poppedItem != '(') {
						c++;
					}
				}
				if (c > 1) {
					stk.pop();
					c = 0;
				}
			}
		}
		if (stk.isEmpty())
			return false;
		return true;
	}
	
	private static boolean find(char ch) {
		  if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
		    return true;
		  }
		  return false;
		}
		public static boolean checkRedundantBracketsNew(String expression) {
		  Stack<Character> stk = new Stack<>();
		  for (int i = 0; i < expression.length(); ++i) {
		    if (expression.charAt(i) == '(' || find(expression.charAt(i))) {
		      stk.push(expression.charAt(i));
		    } else if (expression.charAt(i) == ')') {
		      boolean flag = false;
		      while (!stk.isEmpty() && stk.peek() != '(') {
		        stk.pop();
		        flag = true;
		      }
		      if (!flag) {
		        return true;
		      }
		      if (!stk.isEmpty()) {
		        stk.pop();
		      }
		    }
		  }
		  return false;
		}

}
