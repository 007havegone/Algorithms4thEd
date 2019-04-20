package com.czx.algorithms.chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Parentheses {
	public static void main(String[] args) {
		while(!StdIn.isEmpty())
		{
			if (test(StdIn.readString()))
				StdOut.println(true);
			else
				StdOut.println(false);
		}
	}

	public static boolean test(String s) {
		Stack<Character> sta = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[')
				sta.push(c);
			else if (!sta.isEmpty()) {
				if (c == ')' && sta.peek() == '(')
					sta.pop();
				else if (c == '}' && sta.peek() == '{')
					sta.pop();
				else if (c == ']' && sta.peek() == '[')
					sta.pop();
			} else
				return false;
		}
		return sta.isEmpty();
	}
}
