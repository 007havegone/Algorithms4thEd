package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class EX11 {
	public static void main(String[] args) {
		printMatrix();
	}

	public static void printMatrix() {
		Boolean [][]arr=new Boolean[][] {{true,true,false,false,true},{true,false,false,true,false},
										{true,false,false,false,true},{true,false,true,true,true},
										{true,false,false,true,true}};
		StdOut.print(" ");
		for(int i=1;i<=5;i++)
			StdOut.printf("%d",i);
		StdOut.println();
		for(int i=1;i<=5;i++)
		{
			StdOut.printf("%d",i);
			for(int j=1;j<=5;j++)
			{
				StdOut.printf("%c",arr[i-1][j-1]?'*':' ');
			}
			StdOut.println();
		}
			
	}
}
