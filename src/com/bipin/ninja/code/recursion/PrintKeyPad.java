package com.bipin.ninja.code.recursion;

public class PrintKeyPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printKeypad(79);
	}

	public static void printKeypad(int input) {

		printKeypad(input, "");

	}

	public static void printKeypad(int input, String op) {

		if (input == 0) {
			System.out.println(op);
			return;
		}
		String str = getChar(input % 10);
		if (str.length() == 4) {
			printKeypad(input / 10, str.charAt(0) + op);
			printKeypad(input / 10, str.charAt(1) + op);
			printKeypad(input / 10, str.charAt(2) + op);
			printKeypad(input / 10, str.charAt(3) + op);
		} else {
			printKeypad(input / 10, str.charAt(0) + op);
			printKeypad(input / 10, str.charAt(1) + op);
			printKeypad(input / 10, str.charAt(2) + op);
		}

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

}
