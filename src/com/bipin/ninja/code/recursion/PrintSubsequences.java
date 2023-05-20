package com.bipin.ninja.code.recursion;

public class PrintSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSequences("xyz", "");

	}

	static void printSequences(String inp, String output) {
		if (inp.length() == 0) {
			System.out.println(output);
			return;
		}

		printSequences(inp.substring(1), output);
		printSequences(inp.substring(1), output + inp.charAt(0));
	}

}
