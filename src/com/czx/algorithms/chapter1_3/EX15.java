package com.czx.algorithms.chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class EX15 {
	public static void main(String[] args) {
		int k=Integer.parseInt(args[0]);
		Queue<String> q=new Queue<String>();
		while(!StdIn.isEmpty())
		{
			q.enqueue(StdIn.readString());
		}
		if(q.size()<k) {
			StdOut.println("不足k个字符串");			
		}
		else {
			k=q.size()-k;
			while(k--!=0)
			{
				q.dequeue();
			}
			StdOut.print(q.dequeue());
		}
	}
}
