package com.bipin.ninja.code.recursion;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 5, 7, 2 };
		System.out.println(sumOfArray(a));
	}

	static int sumOfArray(int[] input) {
		if (input.length - 1 == 0) {
			return input[0];
		}
		int[] newArray = new int[input.length - 1];
		for (int i = 1; i < input.length; i++) {
			newArray[i - 1] = input[i];
		}
		return input[0] + sumOfArray(newArray);
	}

}
