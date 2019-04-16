package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

public class EX23 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 200, 300, 400, 1000 };
		System.out.printf("+ or - ? ");
		char arg = StdIn.readChar();
		StdIn.readLine();
		System.out.printf("Input keys: ");
		String[] keys = StdIn.readLine().split(" ");
		for (int i = 0; i < keys.length; i++) {
			if (rank(Integer.parseInt(keys[i]), arr) != -1 && arg == '-') {
				System.out.printf("%s ", keys[i]);
			} else if (rank(Integer.parseInt(keys[i]), arr) == -1 && arg == '+') {
				System.out.printf("%s ", keys[i]);
			}
		}
	}

	public static int rank(int key, int[] a) {
		return rank(key, a, 0, a.length - 1);
	}

	public static int rank(int key, int[] a, int lo, int hi) {

		if (lo > hi)
			return -1;
		int mid = lo + (hi - lo) / 2;
		if (key < a[mid])
			return rank(key, a, lo, mid - 1);
		else if (key > a[mid])
			return rank(key, a, mid + 1, hi);
		else
			return mid;
	}
}
