package com.bipin.ninja.code.recursion;

public class ReplaceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abacd";
		System.out.println(replaceCharacter(s1, 'a', 'x'));
	}

	public static String replaceCharacter(String input, char c1, char c2) {
		if (input.length() == 0)
			return input;
		if (input.charAt(0) == c1) {
			return c2 + replaceCharacter(input.substring(1), c1, c2);
		}
		return input.charAt(0) + replaceCharacter(input.substring(1), c1, c2);
	}

}
