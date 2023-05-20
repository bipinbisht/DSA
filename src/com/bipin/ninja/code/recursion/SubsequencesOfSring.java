package com.bipin.ninja.code.recursion;

import java.util.Arrays;

public class SubsequencesOfSring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		String[] subsequences = getSubsequences(s);
		 System.out.println(Arrays.toString(subsequences));
	}

	static String[] getSubsequences(String s) {
		if (s.isEmpty()) {
			String[] s1 = { "" };
			return s1;
		}
		int k = 0;
		String[] smallAns = getSubsequences(s.substring(1));
		String[] ans = new String[2 * smallAns.length];
		for (int i = 0; i < smallAns.length; i++) {
			ans[k] = smallAns[i];
			k++;
		}
		for (int i = 0; i < smallAns.length; i++) {
			ans[k] = s.charAt(0) + smallAns[i];
			k++;
		}
		return ans;
	}

}
