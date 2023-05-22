package com.bipin.ninja.code.recursion;

public class CheckAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check("aaabbaab"));

	}

	static boolean check(String str) {

		if (str.length() == 0) {
			return true;
		}
		if (str.charAt(0) == 'a') {
			if (str.substring(1).length() > 1 && str.substring(1, 3).equals("bb")) {
				return check(str.substring(3));
			} else
				return check(str.substring(1));
		}
		return false;

	}

}
