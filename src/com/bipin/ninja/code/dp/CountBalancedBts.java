package com.bipin.ninja.code.dp;

public class CountBalancedBts {

	public static void main(String[] args) {
		System.out.println(balancedBTs(7));

	}
	
	public static long balancedBTs(long n){
		//x*x
		//2xy
		if(n ==0 || n==1)
		return 1;

		long x = balancedBTs(n-1);
		long y = balancedBTs(n-2);

		long value1 = x*x;
		long value2 = 2*(x*y);

		long mod = (long) (Math.pow(10,9)+7);
		return (value1+value2)%mod;
		

	}

}
