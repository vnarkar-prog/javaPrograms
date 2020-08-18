package com.practice.java.programs;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = { 20, 10, 40, 20, 50, 60 };

		int len = a.length;

		for (int i = 0; i < len - 1; i++) {

			for (int j = 0; j < len - 1; j++) {

				if (a[j] > a[j + 1]) {
					int temp;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}

			}
		}
		System.out.println(Arrays.toString(a));
	}

}
