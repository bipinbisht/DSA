package com.bipin.ninja.code.arrays.oneD;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 3, 3 };
		int[] twoSum = twoSum(nums, 6);
		System.out.println(Arrays.toString(twoSum));

	}

	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					int[] arr = { i, j };
					return arr;
				}
			}

		}
		return null;

	}

	public static int[] twoSumEfficent(int[] nums, int target) {

		int[] arr = new int[2];
		int k = 0;
		int i = 0;
		int j = 1;
		while (i < nums.length) {
//			if(j<nums.length-1)
//			j= i+1;
			if ((nums[i] + nums[j]) == target) {
				arr[k] = i;
				k++;
				arr[k] = j;
				;
				k++;
				return arr;
			}
			j++;
			if (j == nums.length) {
				i++;
			}
		}

		return arr;

	}

}
