package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class EX26 {
	public static void main(String[] args) {
		int a=100;
		int b=300;
		int c=50;
		int t;
		StdOut.printf("before %d %d %d\n",a,b,c);
		if(a>b) {t=a;a=b;b=t;}
		if(a>c) {t=a;a=c;c=t;}
		if(b>c) {t=b;b=c;c=t;}
		StdOut.printf("after %d %d %d\n",a,b,c);
	}
}
