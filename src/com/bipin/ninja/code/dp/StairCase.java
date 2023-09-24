package com.bipin.ninja.code.dp;

public class StairCase {

	public static void main(String[] args) {
		System.out.println(dpStaircase(10));
	}

	public static long staircase(int n) {
		int[] arr = new int[n + 1];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		return staircase(n, arr);
	}

	// memoization
	public static int staircase(int n, int[] storage) {

		if (n == 0) {
			storage[n] = 1;
			return storage[n];
		}

		if (n < 0)
			return 0;

		if (storage[n] != -1)
			return storage[n];

		storage[n] = staircase(n - 1, storage) + staircase(n - 2, storage) + staircase(n - 3, storage);

		return storage[n];
	}

	public static long dpStaircase(int n) {
		int[] arr = new int[n + 1];

		arr[0] = 1;

		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				arr[i] = arr[i-1];
			} else if (i == 2) {
				arr[i] = arr[i - 1] + arr[i - 2];
			} else
				arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
		}

		return arr[n];
	}

}
