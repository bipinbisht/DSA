package com.bipin.ninja.code.sorting;

import java.util.Arrays;

public class quickSort {

	public static void main(String[] args) {
		int[] a = { 10, 18, 19, 9, 2, 6, 11 };
		int[] a1 = { 5, 7, 2, 8, 3, 33 };
		int[] a3 = { 1, 2, 4, 5 };
		qSort(a1, 0, a3.length - 1);
		System.out.println(Arrays.toString(a3));

	}

	static void qSort(int[] a, int start, int end) {
		if (start >= end)
			return;
		int pivot = partition(a, start, end);
		qSort(a, start, pivot - 1);
		qSort(a, pivot + 1, end);
		System.out.println(pivot);
	}

	private static int partition(int[] a, int start, int end) {
		int count = 0;
		/***
		 * (find pivot) (place pivot at its position) (ensure small elements towards
		 * left w.r.t pivot) (ensure large elements towards right w.r.t pivot return
		 * pivot)
		 ***/
		int pivot = start;
		int i = start;
		while (i < end) {
			if (a[start] >= a[i + 1]) {
				count++;
			}
			i++;
		}
		int pivotpos = start + count;
		int temp = a[pivot];
		a[pivot] = a[pivotpos];
		a[pivotpos] = temp;

		while (start <= pivotpos && end > pivotpos) {
			if (a[start] < a[pivotpos]) {
				start++;
			} else if (a[end] > a[pivotpos]) {
				end--;
			} else {
				int t = a[start];
				a[start] = a[end];
				a[end] = t;
			}
		}
		return pivotpos;
	}

}
