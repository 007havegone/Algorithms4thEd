package com.czx.algorithms.chapter1_1;
import edu.princeton.cs.algs4.StdIn;

public class EX21 {
	public static void main(String[] args) {
		System.out.print("输入行数:");
		int n = StdIn.readInt();
		String[] nameArray = new String[n];
		int[] intArr1 = new int[n];
		int[] intArr2 = new int[n];
		for (int i = 0; i < n; i++) {
			nameArray[i] = StdIn.readString();
			intArr1[i] = StdIn.readInt();
			intArr2[i] = StdIn.readInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.printf("%4s %4d %4d %6.3f \n", nameArray[i], intArr1[i], intArr2[i],
					1.0* intArr1[i] / intArr2[i]);
			}
	}
}
