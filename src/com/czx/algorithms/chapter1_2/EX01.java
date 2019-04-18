package com.czx.algorithms.chapter1_2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdOut;

public class EX01 {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		Point2D[] pointers = new Point2D[N];
		for (int i = 0; i < N; i++) {
			pointers[i] = new Point2D(Math.random(), Math.random());
			pointers[i].draw();
		}
		if (N > 1) {
			double min = pointers[0].distanceTo(pointers[1]);
			for (int i = 0; i < N - 1; i++)
				for (int j = i + 1; j < N; j++)
					if (pointers[i].distanceTo(pointers[j]) < min)
						min = pointers[i].distanceTo(pointers[j]);
			StdOut.println(min);
		}

	}
}
