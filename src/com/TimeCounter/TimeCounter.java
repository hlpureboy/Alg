package com.TimeCounter;

import com.Algorithm.*;
import com.Generate.*;
import com.xls.parser.*;
public class TimeCounter {
	public static double[][] s=new double[20][5];
	private static double test(int len,int i) {
		long time1;
		int ls[] = new int[len];
		ls = GenerateList.Generate(len);
	    ls=InsertSort.Insert(ls);
		// 计算排序
		time1 = System.currentTimeMillis();
		BubbleSort.Bubble(ls);
		s[i][0]=(System.currentTimeMillis() - time1) / 1000.0;
		time1 = System.currentTimeMillis();
		InsertSort.Insert(ls);
		s[i][1]=(System.currentTimeMillis() - time1) / 1000.0;
		time1 = System.currentTimeMillis();
		QuickSortThread.Quick(ls, 0, len - 1);
		s[i][2]=(System.currentTimeMillis() - time1) / 1000.0;
		time1 = System.currentTimeMillis();
		MergeSort.Merge(ls,0, len-1);;
		s[i][3]=(System.currentTimeMillis() - time1) / 1000.0;
		time1 = System.currentTimeMillis();
		HeapSort.heapSort(ls, len);
		s[i][4]=(System.currentTimeMillis() - time1) / 1000.0;
		return (System.currentTimeMillis() - time1) / 1000.0;
	}
	public static void main(String[] args) {
		//3775, 7550, 37750, 75500
		System.out.println("开始运行算法！");
		int[] numbers = new int[] {3775, 7550, 37750, 75500};
		for (int i=0;i<20;i++) {
			for (int j = 0; j <= 4; j++) {
				test(numbers[i%4],i);
			}
		}
		String[] name=new String[]{"BubbleSort","InsertSort","QuickSortThread","MergeSort","HeapSort"};
		Save2xls.save2xls(s,name,"Alg2");
	}
}
