package com.bipin.ninja.code.dp;

public class MinimumStepsTo1 {

	public static void main(String[] args) {
		System.out.println(dpCountSteps(10));
	}

	public static int countSteps(int n) {
		if (n == 1)
			return 0;
		int op1 = countSteps(n - 1);
		int minSteps = op1;
		if (n % 3 == 0) {
			int op2 = countSteps(n / 3);
			if (minSteps > op2)
				minSteps = op2;
		}
		if (n % 2 == 0) {
			int op3 = countSteps(n / 2);
			if (minSteps > op3)
				minSteps = op3;
		}
		return 1 + minSteps;
	}

	public static int dpCountSteps(int n) {
		int[] storage = new int[n + 1];

		storage[1] = 0;
		for (int i = 2; i <= n; i++) {
			int min = storage[i - 1];
			if (i % 2 == 0) {
				if (min > storage[i / 2])
					min = storage[i / 2];
			}
			if (i % 3 == 0) {
				if (min > storage[i / 3])
					min = storage[i / 3];
			}

			storage[i] = 1 + min;
		}
		return  storage[n];
	}

}
