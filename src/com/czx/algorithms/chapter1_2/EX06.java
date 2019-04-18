package com.czx.algorithms.chapter1_2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class EX06 {
	public static void main(String[] args) {
		String a,b;
		StdOut.println("输入字符串a:");
		a=StdIn.readLine();
		StdOut.println("输入字符串b:");
		b=StdIn.readLine();
		if(a.length()==b.length()&&a.concat(a).indexOf(b)!=-1)
			StdOut.println("字符串a："+a+" 和字符串："+b+" 互为回环变位");
		else
			StdOut.println("字符串a："+a+" 和字符串："+b+" 不能互为回环变位");
	}
}
