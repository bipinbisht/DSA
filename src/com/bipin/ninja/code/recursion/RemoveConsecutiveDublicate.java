package com.bipin.ninja.code.recursion;

public class RemoveConsecutiveDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(removeConsecutiveDuplicates("aabccba"));
	}

	public static String removeConsecutiveDuplicates(String s) {
		if (s.length() == 0 || s.length() == 1)
			return s;

		if (s.charAt(0) == s.charAt(1))
			return removeConsecutiveDuplicates(s.substring(1));

		return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));
	}

}
