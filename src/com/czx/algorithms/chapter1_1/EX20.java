package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class EX20 {
	public static double lnN(double N) {
		double ans = 0;
		if (N <= 0) {
			StdOut.println("N <= 0 ERROR");
			System.exit(0);
		}
		while (N > 0) {
			// ln(N!)=ln(N)+ln((N-1)!)
			ans += Math.log(N);
			N -= 1;
		}
		return ans;
	}

	public static void main(String[] args) {
		double a = 3;
		StdOut.printf("ln(%.1f!)=%.3f", a, lnN(a));
	}
}
