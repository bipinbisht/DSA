package com.bipin.ninja.code.arrays.twoD;

public class RowColSum {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 16 }, { 19, 10, 10 }, { 20, 5, 7 } };

		getLargestSum(arr);
	}

	static void getLargestSum(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		int i = 0;
		int j = 0;
		int maxRow = 0;
		int maxCol = 0;
		int rowMax = 0;
		int colMax = 0;
		int max = Integer.MIN_VALUE;

		for (; i < row; i++) {
			int sumRow = 0;
			for (; j < col; j++) {
				sumRow = sumRow + arr[i][j];
			}
			if (max < sumRow) {
				maxRow = i;
				max = sumRow;
				j = 0;
			}
		}
		rowMax = max;
		max = Integer.MIN_VALUE;
		i = 0;
		j = 0;
//===========================================================================
		for (; j < col; j++) {
			int sumCol = 0;
			for (; i < row; i++) {
				sumCol = sumCol + arr[i][j];
			}
			if (max < sumCol) {
				maxCol = j;
				max = sumCol;
				i = 0;
			}
		}
		colMax = max;

		if (rowMax > colMax) {
			System.out.println("row" + " " + maxRow + " " + rowMax);
		} else {
			System.out.println("col" + " " + maxCol + " " + colMax);
		}

	}
	
	public static void findLargest(int mat[][]){
		boolean isRow = true;
		int largestSum = Integer.MIN_VALUE;
		int num = 0;
		int nRows = mat.length;
		if (nRows == 0) {
		System.out.println("row " + num + " " + largestSum);
		return;
		}
		int mCols = mat[0].length;
		for(int i = 0; i < nRows; i++){
		int rowSum = 0;
		for(int j = 0; j < mCols; j++){
		rowSum += mat[i][j];
		}
		if(rowSum > largestSum){
		largestSum = rowSum;
		num = i;
		}
		}
		for(int j = 0; j < mCols; j++){
		int colSum = 0;
		for(int i = 0; i < nRows; i++){
		colSum += mat[i][j];
		}
		if(colSum > largestSum){
		largestSum = colSum;
		num = j;
		isRow = false;
		}
		}
		if(isRow){
		System.out.println("row " + num + " " + largestSum);
		}else{
		System.out.println("column " + num + " " + largestSum);
		}
		}

}
