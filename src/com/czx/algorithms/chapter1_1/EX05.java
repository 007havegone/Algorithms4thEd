package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class EX05 {
	public static void main(String[] args) {
		double x, y;
		StdOut.print("输入x,y(两者间用空格分开):\n");
		if (!StdIn.isEmpty()) {
			x = StdIn.readDouble();
			y = StdIn.readDouble();
			if (x >= 0 && y >= 0 && x <= 1 && x <= 1)
				StdOut.println("true");
			else
				StdOut.println("false");
		}
	}
}
