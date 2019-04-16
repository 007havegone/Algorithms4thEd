
package com.czx.algorithms.chapter1_1;

import java.util.ArrayList;
import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;

public class EX28 {
	public static void main(String[] args) {
		int[] whitelist = { 12,13,22,23,22,7,8,9,11,7 };
		Arrays.sort(whitelist);
		ArrayList<Integer> list = new ArrayList<>();
		//将重复值删除
		for (int i = 0; i < whitelist.length - 1; i++) {
			if (whitelist[i] != whitelist[i + 1]) {
				list.add(whitelist[i]);
			}
		}
		list.add(whitelist[whitelist.length - 1]);
		whitelist = new int[list.size()];
		for (int i = 0; i < whitelist.length; i++) {
			whitelist[i] = list.get(i);
			System.out.print(whitelist[i] + " ");
		}
		System.out.println();
		System.out.println(BinarySearch.indexOf(whitelist, StdIn.readInt()));
	}

}