package com.bipin.ninja.code.arrays.oneD;

public class TripletSum {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(tripleSum(a, 12));
	}

	public static int tripleSum(int arr[], int x) {
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == x) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						c++;
					}
				}

			}
		}
		return c;
	}

}
