package com.czx.algorithms.chapter1_1;

public class EX17 {
	public static void main(String[] args) {
		exR2(6);
	}
	//无限递归,没有出口
	public static String exR2(int n) {
		String s = exR2(n - 3) + n + exR2(n - 2) + n;
		if(n<=0)return "";
		return s;
	}
}
