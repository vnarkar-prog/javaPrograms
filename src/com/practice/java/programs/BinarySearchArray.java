package com.practice.java.programs;

import java.util.Arrays;

public class BinarySearchArray {

	// for binary search array should be sorted

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
		Logic2(a, 30);
	}

	public static void Logic1(int a[]) {

		// Arrays.binarySearch(a, 20);
		System.out.println(Arrays.binarySearch(a, 110));
	}

	public static void Logic2(int[] b, int key) {

		int l = 0;
		int h = b.length - 1;

		boolean flag = false;

		while (l <= h) {

			int m = (l + h) / 2;
			if (b[m] == key) {
				System.out.println("Element is present in given array");
				flag = true;
				break;
			}
			if (b[m] > key) {

				h = m - 1;

			}
			if (b[m] < key) {

				l = m + 1;
			}
		}

		if (flag == false) {
			System.out.println("Element not found");
		}
	}

}
