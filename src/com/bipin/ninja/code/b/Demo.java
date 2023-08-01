package com.bipin.ninja.code.b;

import java.util.*;

public class Demo {

	public static void main(String[] args) {

		String s = "My Name is,Bipin bisht!";
		System.out.println(getResult(s));
	}

	public static String getResult(String s) {
		String res = "";
		Stack<Character> stk = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			stk.push(s.charAt(i));
		}

		while (!stk.isEmpty()) {
			res += stk.pop();
		}
		return res;
	}

}
