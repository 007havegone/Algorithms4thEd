package com.czx.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class EX14 {
	public static void main(String[] args) {
		int arr[]= {1,2,9,16,32};
		for(int i=0;i<arr.length;i++)
			StdOut.printf("%2d",getLog2N(arr[i]));
	}
	//实际上求二进制下最高为1是第几位
	public static int getLog2N(int n) {
		int ans = 0;
		while (n != 0) {
			ans++;
			n /= 2;
		}
		return ans - 1;
	}
}
