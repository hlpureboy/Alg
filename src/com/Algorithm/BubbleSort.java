package com.Algorithm;

public class BubbleSort {
	public static int[] Bubble(int[] ls) {
		int i, j;
		int len = ls.length;
		int temp;
		boolean flag;
		for (i = 0; i < len; i++) {
			flag = false;
			for (j = 0; j < len - 1 - i; j++) {
				if (ls[j] > ls[j + 1]) {
					temp = ls[j];
					ls[j] = ls[j + 1];
					ls[j + 1] = temp;
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}
		return ls;
	}
}
