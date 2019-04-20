package com.czx.algorithms.chapter1_3;

import java.util.Iterator;

public class ResizingArrayQueueOfStrings implements Iterable<String>{
	private String[] a = new String[1];// 队列元素
	private int N = 0;

	public boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}
	public int capacity() {
		return a.length;
	}
	private void resize(int max) {// 将队列移动到大小为max的新队列
		String[] temp = new String[max];
		for (int i = 0; i < N; i++)
			temp[i] = a[i];
		a = temp;
	}

	public void enqueue(String item) {// 将元素加入队列
		if (N == a.length)// 队列已满，从新分配空间
			resize(a.length * 2);
		a[N++] = item;
	}

	public String dequeue() {// 将队首元素出队
		String item = a[0];
		a[0] = null;
		N--;
		for (int i = 0; i < N; i++)
			a[i] = a[i + 1];
		if (N > 0 && N == a.length / 4)
			resize(a.length / 2);
		return item;
	}

	@Override
	public Iterator<String> iterator() {
		return new ArrayIterator();
	}
	private class ArrayIterator implements Iterator<String>
	{//支持后进先出的迭代
		private int i=0;
		public boolean hasNext() {return i<N;}
		public String next() {return a[i++];}
		public void remove() {}
	}
	
}
