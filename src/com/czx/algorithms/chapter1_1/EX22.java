package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class EX22 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 200, 300, 400, 1000 };
		StdOut.print("输入查找的数字:");
		int f = StdIn.readInt();
		StdOut.printf("The index of %d is %d.\n",f,BinarySearch.rank(f, arr,0));
	}
}
