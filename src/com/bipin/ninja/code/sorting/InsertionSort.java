package com.bipin.ninja.code.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int a[] = { 5, 4, 3, 2, 1 };
		insetion(a);
		System.out.println(Arrays.toString(a));
	}

	static void insetion(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > temp) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;
		}
	}

}
