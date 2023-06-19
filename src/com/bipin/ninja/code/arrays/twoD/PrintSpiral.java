package com.bipin.ninja.code.arrays.twoD;

public class PrintSpiral {

	public static void main(String[] args) {
		int[][] a = {    { 1, 2, 3 ,4}, 
						 { 14,15,16,5}, 
					     { 13,20,17,6},
					     { 32,19,18,7},
					     { 11,10,9, 8}};
		
		spiralPrint(a);
	}
	
	
	public static void spiralPrint(int matrix[][]){
		
		int cs = 0;
		int ce = matrix[0].length;
		int rs = 0;
		int re = matrix.length;
		
		while(rs<re && cs<ce)
		{
			for(int i =cs; i<ce; i++)
			{
				System.out.print(matrix[rs][i]+" ");
			}
			rs++;
			
			for(int i =rs; i<re; i++)
			{
				System.out.print(matrix[i][ce-1] +" ");
			}
			ce--;
			if(rs<re)
			{
				for(int i = ce-1; i>=cs; i--)
				{
					System.out.print(matrix[re-1][i]+ " ");
				}
				re--;
			}
			if(cs<ce)
			{
				for(int i=re-1; i>=rs; i--)
				{
					System.out.print(matrix[i][cs] +" ");
				}
				cs++;
			}
			
			
		}
	}

}
