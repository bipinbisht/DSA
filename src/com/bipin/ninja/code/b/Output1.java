package com.bipin.ninja.code.b;

import java.util.Arrays;
import java.util.Scanner;

public class Output1 {
	public static void main(String[] args) {
		int[] a = { 3, 4, 7, 8, 9, 11, 12, 13, 17, 19 };
		int[] a1 = { 1, 4, 5, 6, 11, 12, 13, 14, 17 };

		int[] a2 = { 4, 3, 2, 1 };
		int[] a3 = { 15, 13, 4, 3, 18, 2, 1 };
		selectionSort(a3);
		System.out.println(Arrays.toString(a3));
	}

	static int search(int[] arr, int target) {
		{
			int s = 0;
			int e = arr.length - 1;

			while (s <= e) {
				int mid = s + (e - s) / 2;

				if (arr[mid] == target)
					return mid;
				else if (target > arr[mid])
					s = mid + 1;
				else
					e = mid - 1;
			}
			return -1;

		}

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