package com.bipin.ninja.code.arrays.oneD;

import java.util.Arrays;

public class FindPairWithSmallDifference {

	public static void main(String[] args) {

//		int[] a = { 10, 20, 30 };
//		int[] b = { 17, 15 };
		int[] a = { 10, 12, 20, 30 };
		int[] b = { 17, 15, 28 };
		System.out.println(getMin2(a, b));

//		Arrays.sort(a);
//		Arrays.sort(b);
//
//		int i = 0;
//		int j = 0;
//		int min = Integer.MAX_VALUE;
//		int difference = 0;
//
//		while (i < a.length && j < b.length) {
//
//			difference = getMin(a, b, i, j);
//			if (a[i] < b[j])
//				i++;
//			else
//				j++;
//
//			if (min > difference)
//				min = difference;
//
//		}
//		System.out.println(min);
	}

	static int getMin(int[] a, int[] b, int i, int j) {
		if (a[i] > b[j])
			return a[i] - b[j];
		else

			return b[j] - a[i];

	}

	static int getMin2(int[] a, int[] b) {
		int minDiff = Math.abs(a[0] - b[0]);

		Arrays.sort(a);
		Arrays.sort(b);

		int i = 0;
		int j = 0;

		while (i < a.length && j < b.length) {
			minDiff = Math.min(minDiff, Math.abs(a[i] - b[j]));
			if (a[i] < b[j])
				i++;
			else
				j++;

		}
		return minDiff;

	}

}
