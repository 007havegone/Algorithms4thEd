package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;
public class EX27 {
	private static long COUNT = 0;
	private static long COUNT2 = 0;
	private static double[][] MATRIX;
	//递归
	public static double binomial(int N, int k, double p) {
		//每调用10亿次打印一次次数
		if(COUNT++%1000000000==0)
			StdOut.println(COUNT);
		if (N == 0 && k == 0) {
			return 1.0;
		}
		if (N < 0 || k < 0) {
			return 0.0;
		}
		return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
	}
	//备忘录方法
	private static double bin(int N, int k, double p) {
		COUNT2++;
		if (N == 0 && k == 0) {
			return 1.0;
		}
		if (N < 0 || k < 0) {
			return 0.0;
		}
		if (MATRIX[N][k] == -1) {
			MATRIX[N][k] = (1.0 - p) * bin(N - 1, k, p) + p * bin(N - 1, k - 1, p);
		}
		return MATRIX[N][k];
	}

	public static double OptimalBinomial(int N, int k, double p) {
		MATRIX = new double[N + 1][k + 1];
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= k; j++) {
				MATRIX[i][j] = -1;
			}
		}
		return bin(N, k, p);
	}

	public static void main(String[] args) {
		System.out.println("result: " + OptimalBinomial(100, 50, 0.25) + ", count: " + COUNT2);
		System.out.println("result: " + binomial(100, 50, 0.25) + ", count: " + COUNT);
	}
}