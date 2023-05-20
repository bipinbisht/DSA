package com.bipin.ninja.code.recursion;

import java.util.Arrays;
import java.util.*;;

public class KeyPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] s = keypad(97);
//		System.out.println(s.length);
//		System.out.println(Arrays.toString(s));
		System.out.println(letterCombinations("97"));
		
	}

	public static String[] keypad(int n) {

		if (n == 0) {
			String[] s = { "" };
			return s;
		}
		int rev = n % 10;
		int grow = 0;

		String[] smallAns = keypad(n / 10);
		if (rev == 7 || rev == 9) {
			grow = 4;
		} else {
			grow = 3;
		}
		String[] ans = new String[grow * smallAns.length];
		int k = 0;

		String s1 = getChar(rev);
		for (int i = 0; i < smallAns.length; i++) {
			for (int j = 0; j < s1.length(); j++) {
				ans[k] = smallAns[i] + s1.charAt(j);
				k++;
			}
		}
		return ans;
	}

	static String getChar(int n) {
		String s = "";
		switch (n) {
		case 1:
			s = "";
			break;
		case 2:
			s = "abc";
			break;
		case 3:
			s = "def";
			break;
		case 4:
			s = "ghi";
			break;
		case 5:
			s = "jkl";
			break;
		case 6:
			s = "mno";
			break;
		case 7:
			s = "pqrs";
			break;
		case 8:
			s = "tuv";
			break;
		case 9:
			s = "wxyz";
			break;
		}
		return s;
	}

	private static void getLetterCombinations(String[] arr, String s, List<String> ans, String ds, int start) {
		if (start == s.length()) {
			ans.add(ds);
			return;
		}

		for (int i = (s.charAt(start) - '2'), j = 0; j < arr[i].length(); j++)
			getLetterCombinations(arr, s, ans, ds + arr[i].charAt(j), start + 1);
	}

	public static List<String> letterCombinations(String digits) {
		List<String> ans = new LinkedList<>();
		if (digits.length() == 0)
			return ans;
		String[] arr = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		getLetterCombinations(arr, digits, ans, "", 0);
		return ans;
	}
}
