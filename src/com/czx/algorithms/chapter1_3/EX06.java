package com.czx.algorithms.chapter1_3;

import edu.princeton.cs.algs4.StdOut;

public class EX06 {
	public static void main(String[] args) {
		Stack<String>stack=new Stack<String>();
		Queue<String> q=new Queue<String>();
		for(int i=0;i<10;i++)
			q.enqueue(""+i);
		while(!q.isEmpty())
		{
			stack.push(q.dequeue());
		}
		while(!stack.isEmpty())
		{
			q.enqueue(stack.pop());
		}
		for(String s:q)
			StdOut.print(s+" ");
	}
}
