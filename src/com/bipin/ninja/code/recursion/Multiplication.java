package com.bipin.ninja.code.recursion;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiplyTwoIntegers(4, 5));

	}

	public static int multiplyTwoIntegers(int m, int n) {

		if (m == 0 && n == 0)
			return 0;
		if (n == 0)
			return n;
		int ans = multiplyTwoIntegers(m, n-1);
		return ans + m;
	}
}