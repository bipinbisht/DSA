package com.bipin.ninja.code.arrays.oneD;

import java.util.Arrays;

public class ArrangeNumbersInArray {

	public static void main(String[] args) {

		int[] a = new int[5];
		int n = a.length;
		int s = 0;
		int e = n - 1;
		int nbr = 1;

		while (s <= e) {
			if (nbr % 2 == 1) {
				a[s] = nbr;
				nbr++;
				s++;
			} else {
				a[e] = nbr;
				nbr++;
				e--;
			}
		}

		System.out.println(Arrays.toString(a));

	}

}
