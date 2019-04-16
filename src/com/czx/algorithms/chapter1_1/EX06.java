package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class EX06 {
	public static void main(String[] args) {
		int f = 0;
		int g = 1;
		//斐波那契队列
		for (int i = 0; i <= 15; i++) {
			StdOut.println(f);
			f = f + g;
			g = f - g;
		}
	}
}
