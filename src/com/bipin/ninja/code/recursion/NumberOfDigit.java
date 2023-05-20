package com.bipin.ninja.code.recursion;

public class NumberOfDigit {

	public static void main(String[] args) {

		System.out.println(countDigit(731));
	}

	static int countDigit(int n) {

		int c = 0;
		while (n > 0) {
			n = n / 10;
			c++;
		}
		return c;
	}
}
