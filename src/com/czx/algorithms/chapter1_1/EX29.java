package com.czx.algorithms.chapter1_1;

import java.util.Arrays;

public class EX29 {
	// 返回小于等于key的元素数量
	public static int rank(int key, int[] a) {
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == key) {
				while (mid >= 0 && a[mid] == key) {
					mid--;
				}
				return ++mid;
			} else if (a[mid] < key) {
				low = mid + 1;
			} else if (a[mid] > key) {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static int count(int key, int[] a) {
		int num = 1;
		int pos = rank(key, a);//返回比num小的个数,因为位序从0开始,则同样是他的下标
		//注意下标不要出界
		while (pos + 1 >= 0 && pos + 1 < a.length && a[pos] == a[pos + 1]) {
			++num;
			++pos;
		}
		return num;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 56, 15, 22, 31, 31, 31, 102, 22, 53, 7, 5, 15, 32, 86, 74, 66, 46, 46, 37, 26, 99 };
		Arrays.sort(a);
		System.out.println(rank(102, a));// 小于102的个数
		System.out.println(count(102, a));// 66出现次数
	}
}
