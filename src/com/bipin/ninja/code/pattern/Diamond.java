package com.bipin.ninja.code.pattern;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int n1 = (n + 1) / 2;
		int n2 = n / 2;
		for (int i = 1; i <= n1; i++) {

			for (int k = 0; k < n1 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		////==========================================2nd half
		for (int i = n2; i > 0; i--) {
			for (int k = n2; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = i * 2 - 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
