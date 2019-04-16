package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class EX18 {
	public static void main(String[] args) {
		int ret=mystery1(10, 13);
		StdOut.println(ret);
		ret=mystery2(2, 10);
		StdOut.println(ret);
		ret=mystery11(110, 9);
		StdOut.println(ret);
		ret=mystery22(2, 11);
		StdOut.println(ret);
		
	}
	//递归版乘法快速幂
	public static int mystery1(int a,int b) {
		if(b==0) return 0;
		if(b%2==0) return mystery1(a+a,b/2);
		else return mystery1(a+a, b/2)+a;
	}
	//递归版乘方快速幂
	public static int mystery2(int a,int b) {
		if(b==0) return 1;
		if(b%2==0) return mystery2(a*a, b/2);
		else return mystery2(a*a, b/2)*a;
	}
	
	//非递归版乘法
	public static int mystery11(int a,int b) {
		int ans=0;
		while(b!=0)
		{
			if(b%2==1)ans+=a;
			a*=2;
			b/=2;
		}
		return ans;
	}
	//非递归版乘方快速幂
	public static int mystery22(int a,int b) {
		int ans=1;
		while(b!=0) {
			if(b%2==1)ans*=a;
			a*=a;
			b/=2;
		}
		return ans;
	}
}
