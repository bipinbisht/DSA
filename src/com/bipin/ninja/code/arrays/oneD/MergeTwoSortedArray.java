package com.bipin.ninja.code.arrays.oneD;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 3, 6, 11, 12, 17 };
		int[] arr2 = { 2, 8, 12, 16, 19 };
		int ans[] = merge(arr1, arr2);

		System.out.println(Arrays.toString(ans));

	}

	static int[] merge(int[] arr1, int[] arr2) {
		int i = 0, j = 0, k = 0;
		int ans[] = new int[arr1.length + arr2.length];
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < arr1.length) {
			ans[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			ans[k] = arr2[j];
			j++;
			k++;
		}

		return ans;

	}

}
