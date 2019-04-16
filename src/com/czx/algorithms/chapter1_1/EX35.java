package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class EX35 {
	static double[] dist;
	final static int SIDES = 6;
	//测试大概40000~50000组数据时基本吻合
	public static void main(String[] args) {
		double[] testDist = new double[2 * SIDES + 1];
		StdOut.print("测试数据的数量:");
		int lo = 1, hi = SIDES+1;
		int time = StdIn.readInt();
		for (int i = 0; i < time; i++)
			//两个骰子都随机生成[1-6]
			++testDist[StdRandom.uniform(lo, hi)+StdRandom.uniform(lo,hi)];
		for(int i=1;i<testDist.length;i++)
			testDist[i]/=time;
		StdOut.println("标准概率分布:");
		probability();
		show(dist);
		StdOut.println("测试数据概率分布:");
		show(testDist);
	}

	public static void probability() {

		dist = new double[2 * SIDES + 1];
		for (int i = 1; i <= SIDES; i++)
			for (int j = 1; j <= SIDES; j++)
				dist[i + j] += 1.0;
		for (int k = 2; k <= 2 * SIDES; k++)
			dist[k] /= 36.0;
	}

	public static void show(double[] arr) {
		if (arr != null)
			for (int i = 1; i < arr.length; i++)
				StdOut.printf("%.4f ",arr[i]);
		StdOut.println();
	}
	
}
