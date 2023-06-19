package com.bipin.ninja.code.strings;

public class HighestOccuringCharacter {

	public static void main(String[] args) {

		String s = "ax";

		System.out.println(highestOccuringChar(s));

	}

	public static char highestOccuringChar(String str) {

		char ans = 0;
		int frequency = 0;

		while (str.length() > 0) {
			int len = str.length();
			char ch = str.charAt(0);
			str = str.replace(ch + "", "");
			int currentFrequency = len - str.length();
			if (currentFrequency > frequency) {
				frequency = currentFrequency;
				ans = ch;
			}

		}
		return ans;
	}

}
