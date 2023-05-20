package com.bipin.ninja.code.recursion;

public class GeometricSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findGeometricSum(3));
	}

	public static double findGeometricSum(int k) {

		if (k == 0)
			return 1;
		double smallans = findGeometricSum(k - 1);
		return 1 / Math.pow(2, k) + smallans;

	}

}
