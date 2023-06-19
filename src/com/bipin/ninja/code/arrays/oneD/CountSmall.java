package com.bipin.ninja.code.arrays.oneD;

import java.util.Arrays;

public class CountSmall {

	public static void main(String[] args) {

		int[] a1 = { 2, 3, 0 };
		int[] a2 = { 1, 5 };
//		int[] a1 = { 2, 5, 4, 10 };
//		int[] a2 = { 1, 2, 4, 4, 4, 6, 11 };
		Arrays.sort(a2);
		int[] ans = new int[a1.length];
		for (int i = 0; i < a1.length; i++) {
			ans[i] = binarySearch1(a2, a1[i] + 1);
		}

		System.out.println(Arrays.toString(ans));
	}

	public static int binarySearch(int[] a, int element) {
		int low = 0;
		int high = a.length - 1;

		while (low < high) {

			int mid = low + (high - low) / 2;

			if (element <= a[mid])
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}

	public static int binarySearch1(int[] a, int element) {
		int low = 0;
		int high = a.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (element <= a[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		return low;
	}

}
