package com.bipin.ninja.code.recursion;

public class findElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 5 };
		int target = 5;
		System.out.println(checkNumber2(a, target));
//		System.out.println(Arrays.toString(n));
	}

	static boolean checkNumber(int input[], int x) {
		if (input.length == 1)
			if (input[0] != x)
				return false;
		if (input.length > 0)
			if (input[0] == x)
				return true;
		int[] newArray = new int[input.length - 1];
		for (int i = 1; i < input.length; i++) {
			newArray[i - 1] = input[i];
		}
		return checkNumber(newArray, x);
	}

	static boolean checkNumber1(int input[], int x) {
		if (input[0] == x)
			return true;
//		if (input.length == 1)
//			if (input[0] == x)
//				return true;
//			else
//				return false;
		int[] newArray = new int[input.length - 1];
		for (int i = 1; i < input.length; i++) {
			newArray[i - 1] = input[i];
		}
		return checkNumber(newArray, x);
	}

	static boolean checkNumber2(int input[], int x) {
		if (input[0] == x)
			return true;
		if (input.length == 1) {
			return false;
		}
		int[] newArray = new int[input.length - 1];
		for (int i = 1; i < input.length; i++) {
			newArray[i - 1] = input[i];
		}
		return checkNumber2(newArray, x);
	}

}	
