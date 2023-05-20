package com.bipin.ninja.code.recursion;

public class FirstIndexOcuurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 9, 8, 10, 8 };
		int target = 10;
		int ans = lastIndex(a, target);
		System.out.println(ans);
	}

	public static int lastIndex(int input[], int x) {

		int ans = lastIndex1(input, x, input.length - 1);
		return ans;

	}

	static int firstIndex(int[] input, int target, int startIndex) {

		if (input[startIndex] == target)
			return startIndex;

		if (startIndex >= input.length - 1)
			return -1;

		return firstIndex(input, target, startIndex + 1);
	}

	static int lastIndex(int[] input, int target, int startIndex, int count, int lastindex) {

		if (input[startIndex] == target) {
			lastindex = startIndex;
			count++;
			if (count > 1)
				return startIndex;
		}
		if (startIndex >= input.length - 1 && count == 1)
			return lastindex;

		if (startIndex >= input.length - 1)
			return -1;

		return lastIndex(input, target, startIndex + 1, count, lastindex);
	}

	static int lastIndex1(int[] input, int target, int lastIndex) {

		if (input[lastIndex] == target)
			return lastIndex;
		if (lastIndex <= 0)
			return -1;
		return lastIndex1(input, target, lastIndex - 1);
	}

}
