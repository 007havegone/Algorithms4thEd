package com.czx.algorithms.chapter1_3;

import edu.princeton.cs.algs4.StdOut;

public class EX12 {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		for (int i = 0; i < 10; i++)
			s.push(i + "");
		Stack<String> copy = Stack.copy(s);
		StdOut.println("the original stack: ");
		for (String t : s)
			StdOut.print(t + " ");

		StdOut.println();

		StdOut.println("the copy stack: ");
		for (String t : copy)
			StdOut.print(t + " ");

		StdOut.println("\ns = " + s + "\ncopy = " + copy);
	}
}
