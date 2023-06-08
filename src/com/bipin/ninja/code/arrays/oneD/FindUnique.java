package com.bipin.ninja.code.arrays.oneD;

public class FindUnique {

	public static void main(String[] args) {

		int[] a = { 2, 7, 2, 7 ,1};
		int findUnique = findUnique(a);
		System.err.println(findUnique);

	}

	public static int findUnique(int[] a) {
		int unique = a[0];

		for (int i = 1; i < a.length; i++) {
			unique = unique ^ a[i];
			
		}

		return unique;
	}

}
