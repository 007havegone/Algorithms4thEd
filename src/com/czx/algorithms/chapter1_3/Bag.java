package com.czx.algorithms.chapter1_3;

import java.util.Iterator;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Bag<Item> implements Iterable<Item> {
	private Node first;// 链表的首结点
	private int N;

	private class Node {
		Item item;
		Node next;
	}

	public void add(Item item) {// 和Stack的push方法相同
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}

	public int size() {
		return N;
	}

	@Override
	public Iterator<Item> iterator() {
		return new ListIterator();
	}

	private class ListIterator implements Iterator<Item> {
		private Node current = first;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}

	}

	public static void main(String[] args) {
		Bag<Double> numbers = new Bag<Double>();
		while (!StdIn.isEmpty())
			numbers.add(StdIn.readDouble());
		int N = numbers.size();
		double sum = 0.0;
		for (double x : numbers)
			sum += x;
		double mean = sum / N;
		sum = 0.0;
		for (double x : numbers)
			sum += (x - mean) * (x - mean);
		double std = sum / (N - 1);
		StdOut.printf("Mean: %.2f\n", mean);
		StdOut.printf("Std dev: %.2f\n", std);
		// 迭代Bag数据类型
		for(Double i:numbers)
			StdOut.print(i+" ");
	}
}
