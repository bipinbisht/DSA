package com.bipin.ninja.code.arrays.oneD;

public class FindDublicate {

	public static void main(String[] args) {
		
		int[] a = {4,5,6,1,1};
		
		System.out.println(findDublicate(a));
	}

	private static int findDublicate(int[] a) {

		for(int i =0; i<a.length; i++) {
			for(int j=i+1;j<a.length; j++) {
				if(a[i] == a[j])
					return a[i];
			}
		}
		return Integer.MIN_VALUE;
	}

}
