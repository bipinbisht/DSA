package com.bipin.ninja.code.pattern;

import java.util.Scanner;

public class Parallelogram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();

		for (int i = n; i > 0; i--) {
			for (int k = n; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
