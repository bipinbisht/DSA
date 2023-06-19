package com.bipin.ninja.code.strings;

public class IsPermutation {

	public static void main(String[] args) {

		String s1 = "abcd";
		String s2 = "abce";
		System.out.println(isPermutation(s1, s2));

	}

	public static boolean isPermutation(String str1, String str2) {

		if (str1.length() != str2.length())
			return false;

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		while (str1.length() > 0 || str2.length() > 0) {
			char ch = str1.charAt(0);

			str1 = str1.replace(ch + "", "");
			str2 = str2.replace(ch + "", "");

			if (str1.length() != str2.length())
				return false;
		}
		if (str1.length() == str2.length())
			return true;
		return false;
	}

}
