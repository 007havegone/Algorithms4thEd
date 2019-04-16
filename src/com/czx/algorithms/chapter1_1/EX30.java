package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class EX30 {
	public static int GCD(int a,int b) {
		if(b==0)return a;
		return GCD(b,a%b);
	}
	public static void main(String[] args) {
		StdOut.print("输入二维数组的行(N*N): ");
		int N=StdIn.readInt();
		boolean[][] matrix=new boolean[N+1][N+1];
		for(int i=1;i<N;i++)
			for(int j=1;j<=N;j++) {
				if(GCD(i,j)==1)
					matrix[i][j]=true;
				else
					matrix[i][j]=false;
			}
		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<=N;j++)
				StdOut.printf("%5s ",matrix[i][j]);
			StdOut.println();
		}
	}
	
}
