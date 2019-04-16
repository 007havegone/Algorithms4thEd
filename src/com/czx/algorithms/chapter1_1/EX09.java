package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class EX09 {
	public static void main(String[] args) {
		StdOut.println(toBinaryString(15));
	}
	public static String toBinaryString(int t) {
		String ans = "";
		for(int n=t;n>0;n/=2)
		{
			ans=(n%2)+ans;
		}
		if(ans.length()==0)
			return "0";
		else
			return ans;
	}
}
