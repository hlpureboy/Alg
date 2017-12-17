package com.Algorithm;

public class HeapSort {
	public static void siftDown(int[] H, int n, int i) {
		boolean done = false;
		while (!done && ((i = 2 * i + 1) < n)) {
			if ((i + 1 < n) && (H[i + 1] > H[i])) {
				i = i + 1;
			}
			if ((H[(i - 1) / 2] < H[i])) {
				int temp = H[(i - 1) / 2];
				H[(i - 1) / 2] = H[i];
				H[i] = temp;
			} else {
				done = true;
			}
		}
	}

	public static void makeHeap(int[] H, int n) {
		for (int i = n / 2 - 1; i >= 0; i--) {
			siftDown(H, n, i);
		}
	}

	public static void heapSort(int[] H, int n) {
		makeHeap(H, n);
		for (int i = n - 1; i > 0; i--) {
			int temp = H[0];
			H[0] = H[i];
			H[i] = temp;
			siftDown(H, i, 0);
		}
	}
}
