package com.bipin.ninja.code.arrays.twoD;

public class RowWiseSum {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 1, 2, 3 },{1,5,7,8} };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.print(sum + " ");
			sum = 0;
		}
	}

}
