package com.bipin.ninja.code.recursion;

public class StairProblem {

	public static void main(String[] args) {
		System.out.println(staircase(5));
	}

	public static int staircase(int n) {
		if (n == 0)
			return 1;
		if (n < 0)
			return 0;
		int path1count = staircase(n - 1);
		int path2count = staircase(n - 2);
		int path3count = staircase(n - 3);

		return path1count + path2count + path3count;
	}
}
