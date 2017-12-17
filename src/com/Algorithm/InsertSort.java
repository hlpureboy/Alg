package com.Algorithm;

public class InsertSort {
	public static int[] Insert(int[] ls) {
		int x, j;
		for (int i = 0; i < ls.length - 1; i++) {
			x = ls[i];
			j = i - 1;
			while (j >= 0 && ls[j] > x) {
				ls[j + 1] = ls[j];
				j--;
			}
			ls[j + 1] = x;
		}
		return ls;
	}
}
