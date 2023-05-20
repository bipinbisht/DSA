package com.bipin.ninja.code.recursion;

import java.util.Arrays;

public class AllIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 9, 8, 10, 8, 8 };
		int target = 10;
		int[] arr = allIndexes(a, target);
		System.out.println(Arrays.toString(arr));
//		int countOccurence = countOccurence(a, target, 0, 0);
//		System.out.println(countOccurence);
	}

	public static int[] allIndexes(int input[], int x) {
		int[] ans = new int[input.length];
		int[] ans1 = allIndexes(input, x, 0, ans, 0);
		int countOccurence = countOccurence(input, x, 0, 0);
		int[] newArray = new int[countOccurence];
		for (int i = 0; i < countOccurence; i++) {
			newArray[i] = ans1[i];
		}
		return newArray;

	}

	public static int[] allIndexes(int input[], int target, int startIndex, int[] ans, int index) {

		if (input[startIndex] == target) {
			ans[index] = startIndex;
			index++;
		}

		if (startIndex >= input.length - 1)
			return ans;

		return allIndexes(input, target, startIndex + 1, ans, index);
	}

	public static int countOccurence(int[] input, int target, int startIndex, int count) {

		if (input[startIndex] == target) {
			count++;
		}

		if (startIndex >= input.length - 1)
			return count;

		return countOccurence(input, target, startIndex + 1, count);
	}
}
