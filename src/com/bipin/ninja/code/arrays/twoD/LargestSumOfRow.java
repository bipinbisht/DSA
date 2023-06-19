package com.bipin.ninja.code.arrays.twoD;

public class LargestSumOfRow {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 10, 10, 10 },{1,5,7} };
			System.out.println(getLargestColSum(arr));
	}
	
	static int getLargestSum(int[][] arr)
	{
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			int sum =0; 
			for(int j =0; j<arr[i].length; j++)
			{
				sum = sum+arr[i][j];
			}
			if(max<sum)
			{
				max = sum;
			}
		}
		return max;
	}
	
	static int getLargestColSum(int[][] arr)
	{
		int max = Integer.MIN_VALUE;
		int row = arr.length;
		int col = arr[0].length;
		for(int j =0; j<col; j++)
		{
			int sum =0;
			for(int i =0; i<row; i++)
			{
				sum+=arr[i][j];
			}
			if(sum>max)
			{
				max = sum;
			}
		}
		return max;
	}

}
