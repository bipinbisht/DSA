package com.bipin.ninja.code.recursion;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pixppi";
		s= s.replace("pi", "3.14");
		System.out.println(s);
//		System.out.println(sumOfDigits(15));
	}

	public static int sumOfDigits(int input) {

		if (input == 0 || input == 1)
			return input;
		int rem = input % 10;
		input = input / 10;
		return rem + sumOfDigits(input);
	}

}
