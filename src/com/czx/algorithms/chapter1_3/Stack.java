package com.czx.algorithms.chapter1_3;

import java.util.Iterator;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Stack<Item> implements Iterable<Item> {
	private Node first;// 栈顶(最近添加的元素)
	private int N; // 元素个

	private class Node {
		Item item;
		Node next;
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}

	public void push(Item item) {// 栈顶添加元素
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}

	public Item pop() {// 从栈顶删除元素
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}

	@Override
	public Iterator<Item> iterator() {
		return new ListIterator();
	}
	private class ListIterator implements Iterator<Item>
	{
		private Node current=first;
		@Override
		public boolean hasNext() {
			return current!=null;
		}
		@Override
		public Item next() {
			Item item =current.item;
			current=current.next;
			return item;
		}
		
	}
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-"))
				s.push(item);
			else if (!s.isEmpty())
				StdOut.print(s.pop() + " ");
		}
		StdOut.println("(" + s.size() + " left on the stack)");
		//后进先出的顺序打印
		for(String a:s)
			StdOut.print(a+" ");
	}

}
