package com.czx.algorithms.chapter1_2;

import edu.princeton.cs.algs4.StdOut;

public class EX07 {
	public static void main(String[] args) {
		StdOut.println(mystery("aabbaa"));
		StdOut.println(mystery("ABCDE"));
		StdOut.println(mystery("XYZMN"));
	}

	public static String mystery(String s) {
		int N = s.length();
		if (N <= 1)
			return s;
		String a = s.substring(0, N / 2);
		String b = s.substring(N / 2, N);
		return mystery(b) + mystery(a);
	}
}
