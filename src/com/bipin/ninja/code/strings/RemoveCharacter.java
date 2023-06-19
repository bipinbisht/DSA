package com.bipin.ninja.code.strings;

public class RemoveCharacter {

	public static void main(String[] args) {

		String s = "aabbca";
		System.out.println(removeAllOccurrencesOfChar(s, 'a'));
	}

	public static String removeAllOccurrencesOfChar(String str, char ch) {

		int i = 0;
		String op = "";

		while (i < str.length()) {
			if (ch != str.charAt(i))
				op = op + str.charAt(i);
			i++;
		}
		return op;
	}

}
