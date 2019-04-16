package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class EX16 {
	public static void main(String[] args) {
		//自己写一下调用的栈情况推导
		StdOut.print(exR1(6));
	}

	public static String exR1(int n) {
		if (n <= 0)	return "";
		return exR1(n - 3) + n + exR1(n - 2) + n;
	}
}
