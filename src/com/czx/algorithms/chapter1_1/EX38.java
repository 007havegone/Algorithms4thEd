package com.czx.algorithms.chapter1_1;

import java.util.Arrays;
import java.util.Random;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class EX38 {
	final static int N = 1000000;
	static Random rd;
	static int[] key;

	public static void init() {
		rd = new Random();
		key = new int[N];
		for (int i = 0; i < key.length; i++)
			key[i] = rd.nextInt();
	}
/*
 * 当 N = 1000000
 * BFS 588033
 * BNS 4562
 */
	public static void main(String[] args) {
		EX38.init();// 随机产生N条待查记录
		long BFT;
		long BNT;
		In in = new In(args[0]);
		int[] whitelist = in.readAllInts();
		long startTime = System.currentTimeMillis();
		long endTime;
		for (int i = 0; i < N; i++)
			if (BruteForceSearch.rank(key[i], whitelist) == -1) {
				StdOut.println(key[i]);
			}
		endTime = System.currentTimeMillis();
		BFT = endTime - startTime;
		startTime = System.currentTimeMillis();
		Arrays.sort(whitelist);
		for (int i = 0; i < N; i++)
			if (BinarySearch.indexOf(whitelist, key[i]) == -1) {
				StdOut.println(key[i]);
			}
		endTime = System.currentTimeMillis();
		BNT = endTime - startTime;
		System.out.println("Brute force search time: " + BFT);
		System.out.println("Binary search time: " + BNT);
	}
}
