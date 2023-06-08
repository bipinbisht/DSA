package com.bipin.ninja.code.pattern;

import java.util.Scanner;

public class InterestingAlphabets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		char ch = (char) ('A' + n);
		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print((char) (ch - 1 + j));

			}
			ch--;
			System.out.println();
		}

	}

}
