package com.czx.algorithms.chapter1_3;

import edu.princeton.cs.algs4.StdOut;

public class EX14 {
	public static void main(String[] args) {
		ResizingArrayQueueOfStrings q=new ResizingArrayQueueOfStrings();
		StdOut.println("Adding the item...");
		for(int i=0;i<32;i++) {
			q.enqueue(i+"");
			StdOut.println("q.size() = "+q.size());
			StdOut.println("q.capacity = "+q.capacity());
		}
		StdOut.println("Deleting the item...");
		while(!q.isEmpty())
		{
			q.dequeue();
			StdOut.println("q.size() = "+q.size());
			StdOut.println("q.capacity = "+q.capacity());
		}
	}
}
