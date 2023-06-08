package com.bipin.ninja.code.pattern;

import java.util.Scanner;

public class IsoscelesTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int k = 0; k < n - i; k++) {
				System.out.print(" ");
			}
			int p = 1;
			int j = 1;
			for (; j <= i; j++) {
				System.out.print(p++);

			}
			p = i - 1;
			for (int x = 1; x <= i - 1; x++) {

				System.out.print(p);
				p--;
			}
			System.out.println();
		}
	}

}
