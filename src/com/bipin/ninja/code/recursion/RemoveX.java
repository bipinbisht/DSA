package com.bipin.ninja.code.recursion;

public class RemoveX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(removeX("xxXXaxsbbd"));
	}

	public static String removeX(String input) {

		input = input.toLowerCase();

		if (input.length() < 1) {
			return input;
		}
		if (input.charAt(0) == 'x')
			return removeX(input.substring(1, input.length()));

		return input.charAt(0) + removeX(input.substring(1, input.length()));

	}

}
