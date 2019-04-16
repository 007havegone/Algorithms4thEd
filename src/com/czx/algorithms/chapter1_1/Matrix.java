package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Matrix {
	// 向量点乘
	public static double dot(double[] x, double[] y) {
		if (x.length != y.length) {
			StdOut.printf("两个向量维数不满足点乘要求");
			System.exit(0);
		}
		double ans = 0;
		for (int i = 0; i < x.length; i++)
			ans += x[i] * y[i];
		return ans;
	}

	// 矩阵和矩阵乘积
	public static double[][] mult(double[][] a, double[][] b) {
		if (a[0].length != b.length) {
			StdOut.printf("两个矩阵维数不满足矩阵乘法");
			System.exit(0);
		}
		double[][] ans = new double[a.length][b[0].length];
		for (int i = 0; i < ans.length; i++)
			for (int j = 0; j < ans[0].length; j++) {
				double t = 0.0;
				for (int k = 0; k < a[0].length; k++)
					ans[i][j] += a[i][k] * b[k][i];
			}
		return ans;
	}
	//矩阵和向量相乘
	public static double[] mult(double[][] a, double[] x) {
		if (x.length != a.length) {
			StdOut.println("向量和矩阵的维数不满足相乘");
			System.exit(0);
		}
		double[] ans = new double[a[0].length];
		for (int i = 0; i < ans.length; i++) {
			double t = 0;
			for (int k = 0; k < x.length; k++)
				t += x[k] * a[k][i];
			ans[i] = t;
		}
		return ans;
	}

	public static double[][] transpose(double[][] a1) {
		int m = a1.length;// 行
		int n = a1[0].length;// 列
		double ans[][] = new double[n][m];
		for (int i = 0; i < a1.length; i++)
			for (int j = 0; j < a1[0].length; j++) {
				ans[j][i] = a1[i][j];
			}
		return ans;
	}

	public static void show(double[] ans) {
		for (int i = 0; i < ans.length; i++)
			StdOut.print(ans[i] + " ");
		StdOut.println();
	}

	public static void show(double[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				StdOut.printf("%.1f  ", ans[i][j]);
			}
			StdOut.println();
		}
	}

}
