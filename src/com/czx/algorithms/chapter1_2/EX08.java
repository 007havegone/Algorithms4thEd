package com.czx.algorithms.chapter1_2;

public class EX08 {
	public static void main(String[] args) {
		int []a=new int[10000000];
		int []b=new int[1000000000];
		//复制引用,而不是数据，效率高
		int []t=a;a=b;b=t;
	}
}
