package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class EX07 {
	public static void main(String[] args) {
		A();
		B();
		C();
	}

	//牛顿迭代法求平方根
	public static void A() {
		double t = 9.0;
		while (Math.abs(t - 9.0 / t) > .001) {
			t = (9.0 / t + t) / 2.0;
		}
		StdOut.printf("%.5f\n", t);
	}

	public static void B() {
		int sum = 0;
		for (int i = 1; i < 1000; i++)
			for (int j = 0; j < i; j++)
				sum++;
		StdOut.println(sum);
	}

	public static void C() {
		int sum = 0;
		// log_2(1000)=9,则外层一共执行10次
		for (int i = 1; i < 1000; i *= 2)
			for (int j = 0; j < 1000; j++)
				sum++;
		StdOut.println(sum);
	}
}
