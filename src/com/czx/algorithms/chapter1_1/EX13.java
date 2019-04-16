package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class EX13 {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4, 5 }, { 4, 5, 6, 7, 8 }, { 9, 8, 7, 6, 5 } };
		StdOut.print("before transposition\n");
		show(arr);
		arr = transposition(arr);
		StdOut.print("after transposition\n");
		show(arr);
	}

	public static void show(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				StdOut.printf("%3d", arr[i][j]);
			}
			StdOut.println();
		}
	}

	public static int[][] transposition(int arr[][]) {
		int m = arr.length;// 行
		int n = arr[0].length;// 列
		int ans[][] = new int[n][m];
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[0].length; j++) {
				ans[j][i] = arr[i][j];
			}
		return ans;
	}
}
