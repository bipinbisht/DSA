package com.bipin.ninja.code.arrays.twoD;
import java.util.Scanner;
public class PrintLikeWave {

	public static void main(String[] args) {

//		int[][] a = { { 1, 2, 3, 4 }, 
//					  { 5, 6, 7, 8 }, 
//					  { 9, 10, 11, 12 } };
		
		int[][] a = {{1,2,3},{1,2,3},{1,2,3}};

		
		printWave(a);
		    
		
	}
	static void printWave(int[][] a) {
		if(a.length ==0)
			return;

		int row = a.length;
		int col = a[0].length;
		int i = 0;
		int j = 0;
		while (j < col) {
			while (i < row) {
				System.out.print(a[i][j]+" ");
				i++;
			}
			i = i-1;
			j=j+1;
			if(j>=col)
				break;
			while (i >= 0) {
				System.out.print(a[i][j]+" ");
				i--;
			}
			i++;
			j++;
		}
	}

}


