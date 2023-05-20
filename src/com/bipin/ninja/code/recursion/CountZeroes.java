package com.bipin.ninja.code.recursion;

public class CountZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0102004;
//		String s = n + "";
//		int b = Integer.parseInt(Integer.toString(n, 8));
//
//		System.out.println(b);
//		System.out.println(n);
//		System.out.println(countZerosRec(n));
		System.out.println(newCountzero(n));
	}

	public static int countZerosRec(int input) {
//
//		int n = Integer.parseInt(Integer.toString(input, 8));
//		if (input != n)
//			return countZerosRec(input, 0);

		return countZerosRec(input, 0);

	}

	public static int countZerosRec(int input, int count) {

		int r = input % 10;
		if (r == 0)
			count++;
		input = input / 10;

		if (input == 0)
			return count;

		return countZerosRec(input, count);
	}
	
	static int newCountzero(int input) {
	       if(input<10)
           {
         if(input==0)
         return 1;
     else
         return 0;
     }
     if(input%10==0)
     return 1+newCountzero(input/10);
     else
        return newCountzero(input/10);
     }
}
