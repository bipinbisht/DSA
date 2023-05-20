package com.bipin.ninja.code.recursion;

public class PalindromeString {

	public static void main(String[] args) {

		String s = "abcba";
//		System.out.println(isStringPalindrome(s));
		System.out.println(isPalin(s));

	}

	public static boolean isStringPalindrome(String input) {

		return isStringPalindrome(input, 0, input.length() - 1);
	}

	public static boolean isStringPalindrome(String input, int start, int end) {

		if (input.length() == 1)
			return true;
		if (start > end)
			return true;

		char ch1 = input.charAt(start);
		char ch2 = input.charAt(end);

		if (ch1 != ch2)
			return false;
		start++;
		end--;
		return isStringPalindrome(input, start, end);
	}

	public static boolean isPalin(String s) {

		if (s.length() == 1)
			return true;

		if (s.charAt(0) != s.charAt(s.length() - 1))
			return false;

		return isPalin(s.substring(1, s.length() - 1));
	}

}
