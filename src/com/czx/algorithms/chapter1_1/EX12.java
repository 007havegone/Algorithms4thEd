package com.czx.algorithms.chapter1_1;

public class EX12 {
	public static void main(String[] args) {
		int []a=new int[10];
		for(int i=0;i<10;i++)
			a[i]=9-i;
		for(int i=0;i<10;i++)
			System.out.printf("%d ",a[i]);
		System.out.println();
		
		for(int i=0;i<10;i++)
			a[i]=a[a[i]];
		for(int i=0;i<10;i++)
			System.out.printf("%d ",a[i]);
	}
	
}
