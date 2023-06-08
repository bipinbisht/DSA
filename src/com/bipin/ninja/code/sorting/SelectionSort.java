package com.bipin.ninja.code.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a2 = { 4, 3, 2, 1 };
		int[] a3 = { 15, 13, 4, 3, 18, 2, 1 };
		selectionSort(a3);
		System.out.println(Arrays.toString(a3));

	}

	static void selectionSort(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			int min = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					int t = a[j];
					a[j] = min;
					min = t;
				}
			}
			a[i] = min;
		}
	}

}
