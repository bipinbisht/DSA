package com.bipin.ninja.code.strings;

public class ReverseCharacterInEachWord {

	public static void main(String[] args) {
		String s = "Hi";

		String[] split = s.split(" ");
		String ans = "";
		String word = "";

		for (int i = 0; i < split.length; i++) {
			String reverseWordLength = split[i];
			for (int j = 0; j < reverseWordLength.length(); j++) {
				word = reverseWordLength.charAt(j) + word;

			}
			ans += word + " ";
			word = "";

		}

		System.out.println(ans);
	}

}
