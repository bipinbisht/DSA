package com.bipin.ninja.code.arrays.twoD;

public class TotalSumOnBoundariesAndDiagonal {

	public static void main(String[] args) {

		int[][] a = { { 6, 9, 8 ,5 ,9}, 
					  { 2, 4, 1 ,8 ,3}, 
					  { 9, 3, 8, 7, 8},
					  { 6 ,8, 9, 4, 1},
					  { 1,7, 6, 1, 5}};
		int sum = 0;
		if(a.length!=0)
		{
		int row = a.length;
		int col = a[0].length;
		

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(  i+j == row-1 || i==j || (i==0) || (j==0) || (i == row-1) || j == row-1)
				{
					sum += a[i][j];
				}
			}
		}
		}
		System.out.println(sum);

	}

}
