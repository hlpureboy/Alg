package com.Algorithm;

public class QuickSort {
	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int p = partition(arr, low, high);
			quickSort(arr, low, p - 1);
			quickSort(arr, p + 1, high);
		}
	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivot) {
				i = i + 1;
				if (i < j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		if (arr[high] < arr[i + 1]) {
			int temp = arr[i + 1];
			arr[i + 1] = arr[high];
			arr[high] = temp;
		}
		return i + 1;
	}
}