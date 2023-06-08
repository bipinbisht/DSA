package com.bipin.ninja.code.arrays.oneD;

import java.util.Arrays;

public class SwapAlternate {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5};
		
		int i =0;
		int j=1;
		System.out.println(Arrays.toString(a));
		
		while(j<a.length) {
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
			i= i+2;
			j= j+2;
		}
		
		System.out.println(Arrays.toString(a));
	}

}
