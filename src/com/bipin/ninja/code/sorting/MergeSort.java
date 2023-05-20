package com.bipin.ninja.code.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = { 2, 5, 1, 3, 6 };
		int[] a2 = { 8, 3, 4, 12, 5, 6 };
		int[] a3 = { 1, 5, 2, 4 };
//		int[] ms = mergeSort1(a2);
		mergeSort(a3, 0, a3.length - 1);
		System.out.println(Arrays.toString(a3));
//		System.out.println(Arrays.toString(ms));

	}

	static void mergeSort(int[] a) {
//		System.out.println(mergeSort(a, 0, a.length - 1));
//		System.out.println(Arrays.toString(mergeSort1(a)));

	}

	static void mergeSort(int[] a, int start, int end) {
		if (start >= end) {
			System.out.println(start + " " + end);
			return;
		}

		int mid = start + (end - start) / 2;
//		int[] a2 = {  1, 5, 2, 4  };
		mergeSort(a, start, mid);// 1 (0,0)
		mergeSort(a, mid + 1, end);// 2 (1,1)
		
		
		merge(a, start, end);
	}

	static int[] mergeSort1(int[] a) {
		if (a.length == 1)
			return a;
		int mid = a.length / 2;
		int[] left = mergeSort1(Arrays.copyOfRange(a, 0, mid));
		int[] right = mergeSort1(Arrays.copyOfRange(a, mid, a.length));
		return merge(left, right);
	}

	private static int[] merge(int[] first, int[] second) {

		int[] mix = new int[first.length + second.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < first.length && j < second.length) {
			if (first[i] < second[j]) {
				mix[k] = first[i];
				i++;
			}

			else {
				mix[k] = second[j];
				j++;
			}
			k++;
		}
		while (i < first.length) {
			mix[k] = first[i];
			i++;
			k++;
		}
		while (j < second.length) {
			mix[k] = second[j];
			j++;
			k++;
		}
		return mix;

	}

	private static void merge(int[] a, int start, int end) {
		int mid = start + (end - start) / 2;
		int ans[] = new int[end - start + 1];
		int i = start;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j <= end) {
			if (a[i] < a[j]) {
				ans[k] = a[i];
				i++;
				k++;
			} else {
				ans[k] = a[j];
				j++;
				k++;
			}
		}
		while (i <= mid) {
			ans[k] = a[i];
			i++;
			k++;
		}
		while (j <= end) {
			ans[k] = a[j];
			j++;
			k++;
		}

		for (int index = 0; index < ans.length; index++) {
			a[start + index] = ans[index];
		}

	}
}
