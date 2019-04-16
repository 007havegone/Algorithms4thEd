package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class BinarySearch {
	public static int rank(int key, int[] a) {
		return rank(key, a, 0, a.length - 1);
	}

	public static int rank(int key, int[] a, int lo, int hi) {
		if (lo > hi) {
			return -1;
		}
		int mid = lo + (hi - lo) / 2;
		if (key < a[mid]) {
			return rank(key, a, lo, mid - 1);
		} else if (key > a[mid]) {
			return rank(key, a, mid + 1, hi);
		} else {
			return mid;
		}
	}
	//1.1.22
	public static int rank(int key, int[] a,int deep) {
		return rank(key, a, 0, a.length - 1, deep);
	}
	//1.1.22
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

	public static int indexOf(int[] whitelist, int readInt) {
		return rank(readInt,whitelist); 
	}
}