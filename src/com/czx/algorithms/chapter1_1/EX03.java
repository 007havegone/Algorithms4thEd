package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class EX03 {
	public static void main(String[] args) {
		if(args.length==3)
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=Integer.parseInt(args[2]);
			if(a==b&&a==c)
				StdOut.println("equal");
			else
				StdOut.println("not equal");
		}else
			StdOut.println("参数的数量不正确");
			
	}
}
