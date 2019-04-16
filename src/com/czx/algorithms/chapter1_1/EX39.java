package com.czx.algorithms.chapter1_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class EX39 {
	static int[] arr1;
	static int[] arr2;
	//数据量
	final static int[] N= {1000,10000,100000,1000000};
	//测试次数，50000要花的时间很长
	final static int[] T= {1000,2000,5000,10000,20000,50000};
	static double[][] record;// record[i][j] 为规模N[i]的数组,测试次数为T[j]的均值

	public static void main(String[] args) {
		record=new double[N.length][T.length];
//		StdOut.print(record.length+" "+record[0].length);
		showRecord(record);
		solve();
		showRecord(record);
	}
	private static void solve() {
		for(int i=0;i<N.length;i++)//遍历不同规模的问题
		{
			
			int sum;//T[i]次测试下出现相同元素总次数
			double ave;//T[i]次测试下的平均值
			arr1 = new int[N[i]];
			arr2 = new int[N[i]];
			//产生两个随机数组
			for (int j = 0; j < arr1.length; j++) {
				arr1[j] = StdRandom.uniform(100000, 1000000);
				arr2[j] = StdRandom.uniform(100000, 1000000);
			}
			for(int j=0;j<T.length;j++)//遍历不同测试次数
			{
				sum=0;
				int t=T[j];//t次测试
				for(int k=0;k<t;k++)
					sum+=OneTest(arr1, arr2);
				record[i][j]=1.0*sum/t;
				StdOut.printf("record[%d][%d]=%.6f\n",i,j,record[i][j]);
			}
		}
		
	}
	public static void showRecord(double[][]rec) {
		StdOut.printf("%10s","数量\\次数");
		for(int i=0;i<T.length;i++)
			StdOut.printf("%10d ",T[i]);
		StdOut.println();
		for(int i=0;i<rec.length;i++)
		{
			StdOut.printf("%10d ",N[i]);
			for(int j=0;j<rec[0].length;j++)
				StdOut.printf("%10.6f ",rec[i][j]);
			StdOut.println();
		}
			
	}
	public static int OneTest(int[] arr1, int[] arr2) {
		Set<Integer> s = new HashSet<>();// 存取两个数组同时出现的元素
		for (int i = 0; i < arr1.length; i++)
			if (BinarySearch.rank(arr1[i], arr2) != -1 && !s.contains(arr1))
				s.add(arr1[i]);
		return s.size();
	}

}
