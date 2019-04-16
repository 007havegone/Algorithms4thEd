package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class EX22 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 200, 300, 400, 1000 };
		StdOut.print("输入查找的数字:");
		int f = StdIn.readInt();
		StdOut.println(rank(f, arr));
	}

	public static int rank(int key, int[] a) {
		return rank(key, a, 0, a.length - 1, 0);
	}

	public static int rank(int key, int[] a, int lo, int hi, int deep) {
		for (int i = 0; i < deep; i++)
			StdOut.print("  ");
		StdOut.println("Deep:"+ deep +" ["+lo + " " + hi+"]");
		if (lo > hi)
			return -1;
		int mid = lo + (hi - lo) / 2;
		if (key < a[mid])
			return rank(key, a, lo, mid - 1,deep+1);
		else if (key > a[mid])
			return rank(key, a, mid + 1, hi,deep+1);
		else
			return mid;
	}
}
