package com.bipin.ninja.code.pattern;

import java.util.Scanner;

public class TriangleOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int k = 0; k < n - i; k++) {
				System.out.print(" ");
			}
			int p = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(p);
				p++;
			}
			int q = p - 2;
			for (int x = 1; x <= i - 1; x++) {

				System.out.print(q);
				q--;
			}
			System.out.println();
		}
	}

}
