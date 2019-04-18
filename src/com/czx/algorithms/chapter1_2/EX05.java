package com.czx.algorithms.chapter1_2;

import edu.princeton.cs.algs4.StdOut;

public class EX05 {
	//String 本身时不可变对象，只能重新返回一个新的String
	public static void main(String[] args) {
		String s = "Hello World";
		s.toUpperCase();
		s.substring(6, 11);
		StdOut.println(s);

		s = s.toUpperCase();
		s=s.substring(6, 11);
		StdOut.println(s);
	}
}
