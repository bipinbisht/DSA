package com.bipin.ninja.code.recursion;

import java.util.Arrays;

public class MySubsetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3 };
		int[][] subset = getSubset(a, 0);
//		for (int[] i : subset) {
//			for (int x : i) {
//				System.out.println(x);
//			}
//		}
		System.out.println(Arrays.deepToString(subset));

//		for (int i = 0; i < subset.length; i++) {
//			for (int j = 0; j < subset[i].length; j++) {
//				System.out.println(subset[i][j] + " ");
//			}
//
//		}
	}

	static int[][] getSubset(int[] a, int start) {
		if (start == a.length) {
			int[][] a1 = {{}};
			return a1;
		}
		int[][] sa = getSubset(a, start + 1);
		int[][] ans = new int[2 * sa.length][];
		int k = 0;

		for (int i = 0; i < sa.length; i++) {
			// wht is this
			ans[k] = new int[sa[i].length];
			for (int j = 0; j < sa[i].length; j++) {
				ans[k][j] = sa[i][j];
			}
			k++;
		}
		for (int i = 0; i < sa.length; i++) {
			ans[k] = new int[sa[i].length + 1];
			ans[k][0] = a[start];
			for (int j = 1; j <= sa[i].length; j++) {
				ans[k][j] = sa[i][j - 1];
			}
			k++;
		}
		return ans;

	}

}
