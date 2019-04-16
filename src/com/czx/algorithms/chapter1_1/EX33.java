package com.czx.algorithms.chapter1_1;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

import edu.princeton.cs.algs4.StdOut;

public class EX33 {
	public static void main(String[] args) {
		// 2*3
		double[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		// 3*2
		double[][] matrix2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		// 2*2
		double[][] ans = Matrix.mult(matrix1, matrix2);

		Matrix.show(ans);
		StdOut.println();
		Matrix.show(matrix1);
		StdOut.println();
		matrix1 = Matrix.transpose(matrix1);
		Matrix.show(matrix1);
		double[] vec = { 1, 2, 3 };
		double[] rvec = Matrix.mult(matrix2, vec);
		StdOut.println();
		Matrix.show(rvec);
		int arr[]=null;
	}
}