package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class EX24 {
	public static int Euclid(int a,int b) {
		if(b==0)return a;
		else
			return Euclid(b,a%b);
	}
	public static void main(String[] args) {
		int a=17;
		int b=103;
		StdOut.print(Euclid(a,b));
	}
}
