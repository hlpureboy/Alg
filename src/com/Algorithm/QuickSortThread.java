package com.Algorithm;

public class QuickSortThread {
public static void Quick(int[] arr, int low, int high) {
	ThreadGroup group=new ThreadGroup("QuickGroup");
	Thread thread=new Thread(group,new Runnable() {
		@Override
		public void run() {
			QuickSort.quickSort(arr, low, high);	
		}
		
	},"QuickSort",1024*1024*100);
	thread.start();
}
}
