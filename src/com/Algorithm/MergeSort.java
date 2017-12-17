package com.Algorithm;

public class MergeSort {
	public static void Merge(int[] ls, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			Merge(ls, low, mid);
			Merge(ls, mid + 1, high);
			Merge2Sort(ls, low, mid, high);
		}
	}

	public static void Merge2Sort(int[] ls, int p, int q, int r) {
		int[] b = new int[r + 1];
		int i = p, j = q + 1, k = p;
		while (i <= q && j <= r) {
			if (ls[i] < ls[j]) {
				b[k++] = ls[i++];
			} else {
				b[k++] = ls[j++];
			}
			if (i == q + 1) {
				for (; j <= r; j++) {
					b[k++] = ls[j];
				}
			} else {
				for (; i <= q; i++) {
					b[k++] = ls[i];
				}
			}
			for (i = p; i <= r; i++) {
				ls[i] = b[i];
			}
		}
	}
}
