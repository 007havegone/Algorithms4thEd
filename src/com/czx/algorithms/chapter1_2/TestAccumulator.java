package com.czx.algorithms.chapter1_2;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class TestAccumulator {
	public static void main(String[] args) {
		int T=Integer.parseInt(args[0]);
		Accumulator a=new Accumulator();
		for(int i=0;i<T;i++) 
		a.addDateValue(StdRandom.random());
		StdOut.println(a);
	}
}
