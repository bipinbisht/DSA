package com.bipin.ninja.code.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 4, 3, 2, 1, 10, 14, 12 };
		bSort(a);
		System.out.println(Arrays.toString(a));
	}

	static void bSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}
}
