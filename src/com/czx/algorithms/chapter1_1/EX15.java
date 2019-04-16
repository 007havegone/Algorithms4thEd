package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class EX15 {
	public static void main(String[] args) {
		int[] arr = { 7, 8, 9, 1, 2, 2, 8 };
		int[] ans = histogram(arr, 10);
		for (int i = 0; i < ans.length; i++)
			StdOut.printf("ans[%d]=%d  ", i, ans[i]);
	}

	public static int[] histogram(int a[], int M) {
		int[] ans = new int[M];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < a.length; j++)
				if (a[j] == i)
					ans[i]++;
		}
		return ans;
	}
}
