package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdRandom;

public class ShuffleTest {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("参数个数不足");
			System.exit(0);
		}
		int M = Integer.parseInt(args[0]);
		int N = Integer.parseInt(args[1]);
		int[] a = new int[M];
		int[][] cnt = new int[M][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++)
				a[j] = j;
			StdRandom.shuffle(a);
			for (int j = 0; j < M; j++)
				cnt[a[j]][j]++;

		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(cnt[i][j] + " ");
			}
			System.out.println();
		}
	}
}
