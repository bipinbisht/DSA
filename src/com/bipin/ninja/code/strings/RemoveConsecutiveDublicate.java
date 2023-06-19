package com.bipin.ninja.code.strings;

public class RemoveConsecutiveDublicate {

	public static void main(String[] args) {

		String s = "xxyyzxx";
		System.out.println(removeConsecutiveDuplicates(s));
	}

	public static String removeConsecutiveDuplicates(String str) {
		String op = str.charAt(0) + "";

		int i = 1;

		while (i < str.length()) {
			int opl = op.length() - 1;

			if (op.charAt(opl) != str.charAt(i)) {
				op = op + str.charAt(i);
			}
			i++;
		}
		return op;
	}

}
