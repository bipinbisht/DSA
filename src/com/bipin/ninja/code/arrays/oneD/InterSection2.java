package com.bipin.ninja.code.arrays.oneD;

import java.util.Arrays;

public class InterSection2 {

	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 4, 7 ,1};
		int[] arr2 = { 2, 6, 8, 5, 4, 3 ,1};

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		//2,3,4,5,6,8
		//2,3,4,7
		
		int i = 0;
		int j = 0;
		int n = arr1.length;
		int m = arr2.length;
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
//				System.out.print(i);
//				System.out.println("IF");
				i++;
			} else if (arr1[i] > arr2[j]) {
//				System.out.println(j);
//				System.out.println("ELSE IF");
				j++;

			} else {
				
				System.out.print(arr1[i] + " ");
				System.out.println("ELSE");
				i++; 
				j++;
			}

		}
	}

}
