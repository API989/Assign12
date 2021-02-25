package com.assign12.Matrix;

public class Multiplication {
	
	
	public boolean valid(int x[][],int y[][])
	{
		if(x.length==y.length && x[0].length==y[0].length)

			return true;

		return false;
	}
	
	public int[][] multiply(int [][]x,int y[][])
	{
		int result[][]=new int[x.length][y.length];
		for(int i=0;i<x.length;i++) 
		{ 
			for(int j=0;j<x[0].length;j++) 
			{ 
				result[i][j]=x[i][j]*y[i][j]; 
			} 
		} 
		return result;
	}


}
