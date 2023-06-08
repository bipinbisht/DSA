package com.bipin.ninja.code.arrays.oneD;

public class InterSection {

	public static void main(String[] args) {
		
		int[] a1 = { 2, 6, 8, 5,4,3 };
		int[] a2 = { 2,3,4,7 };
		Inter(a1, a2);
	}

	static void Inter(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					arr2[j] = Integer.MIN_VALUE;
					System.out.print(arr1[i] + " ");
					break;
				}
			}
		}
	}
}
