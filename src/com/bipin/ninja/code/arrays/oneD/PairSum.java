package com.bipin.ninja.code.arrays.oneD;

public class PairSum {

	public static void main(String[] args) {
		
		int[] a = {1,3,6,2,5,4,3,2,4};
		System.out.println(pairSum(a, 7));

	}
	
	 public static int pairSum(int arr[], int x) {
		 int c =0;
		 for(int i =0; i<arr.length; i++)
		 {
			 for(int j = i+1; j<arr.length; j++)
			 {
				 if(arr[i]+arr[j] == x)
				 {
					 System.out.println(arr[i] +" " + arr[j]);
					 c++;
				 }
			 }
		 }
		 return c;
	 }

}
