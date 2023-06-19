package com.bipin.ninja.code.arrays.oneD;

import java.util.Arrays;

public class Sort012 {

	public static void main(String[] args) {

		int[] a = { 0, 1, 2, 0, 2, 0, 1 };
		int[] a1 = { 1, 0, 2, 0, 1 };
		sort012(a);
		System.out.println(Arrays.toString(a));
	}

	public static void sort012(int[] arr) {

		int i = 0;
		int nz = 0;
		int nt = arr.length - 1;
		int t = 0;
		while (i < arr.length) {

			if (arr[i] == 0) {

				t = arr[i];
				arr[i] = arr[nz];
				arr[nz] = t;
				i++;
				nz++;
				t = 0;
			} else if ((arr[i] == 2) && i < nt) {

				t = arr[i];
				arr[i] = arr[nt];
				arr[nt] = t;
				nt--;
				t = 0;
			} else {
				System.out.println("11");
				i++;
			}
		}
	}

}
