package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class EX19 {
	public static long F(int N) {
		if (N == 0)
			return 0;
		if (N == 1)
			return 1;
		return F(N - 1) + F(N - 2);
	}

	public static long[] OptiF(int N) {
		long[] fibonacci = new long[N + 1];
		if (N == 0)
			return fibonacci;
		fibonacci[1] = 1;
		for (int i = 2; i <= N; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		return fibonacci;
	}

	public static void main(String[] args) {
		long[] ans = OptiF(90);
		for (int i = 1; i <= 90; i++)
			StdOut.printf("%d ", ans[i]);
	}
}