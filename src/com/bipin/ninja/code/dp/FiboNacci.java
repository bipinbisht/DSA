package com.bipin.ninja.code.dp;

public class FiboNacci {

	public static void main(String[] args) {

		System.out.println(fiboDp(5));
	}

// we are using storage array to make less call for repeated values
	public static long fibo(int n) {
		int[] storage = new int[n + 1];
		for (int i = 0; i < storage.length; i++) {
			storage[i] = -1;
		}
		return improvedFibo(n, storage);
	}

//memoization ----> bottom up approach
	public static int improvedFibo(int n, int[] storage) {

		if (n == 0 || n == 1) {
			storage[n] = n;
			return storage[n];
		}
		if (storage[n] != -1) {
			return storage[n];
		}

		storage[n] = improvedFibo(n - 1, storage) + improvedFibo(n - 2, storage);
		return storage[n];

	}

//dp is top down approach by excluding recursion
	public static int fiboDp(int n) {
		int storage[] = new int[n + 1];
//		storage[0] = 0;
		storage[1] = 1;

		for (int i = 2; i <= n; i++) {
			storage[i] = storage[i - 1] + storage[i - 2];
		}
		return storage[n];
	}

}
