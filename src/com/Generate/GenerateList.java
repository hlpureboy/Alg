package com.Generate;

import java.util.Random;

public class GenerateList {
	private final static int MAX = 60000;

	public static int[] Generate(int len) {
		// Random random=new Random(System.currentTimeMillis());
		// 根据系统时间确定时间种子
		Random random = new Random(123456);
		int[] ls = new int[len];
		for (int i = 0; i < len; i++) {
			ls[i] = random.nextInt(MAX);
		}
		return ls;
	}
}
