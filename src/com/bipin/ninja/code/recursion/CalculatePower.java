package com.bipin.ninja.code.recursion;

public class CalculatePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int po=power(2, 3);
		System.out.println(po);
	}

	public static int power(int x, int n) {

		if (n == 0)
			return 1;
		int ans = power(x, n - 1) * x;
		return ans;
	}

	public static int power1(int base, int powerRaised) {
		if (powerRaised != 0) {

			// recursive call to power()
			return (base * power1(base, powerRaised - 1));
		} else
			return 1;

	}
	
	  static int power2(int N, int P)
	    {
	        if (P == 0)
	            return 1;
	        else
	            return N * power(N, P - 1);
	    }
}
