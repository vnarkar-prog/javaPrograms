package com.practice.java.programs;

public class CompareTwoArray {

	static boolean status;

	public static void main(String[] args) {

		int[] a1 = { 1, 2, 6, 4, 5 };
		int[] a2 = { 1, 2, 3, 4, 5 };

		logic2(a1, a2);

	}

	public static void logic1(int a[], int b[]) {
		if (a.equals(b)) {
			System.out.println("Arrays are equal");

		} else {
			System.out.println("Arrays are not equal");
		}

	}

	public static void logic2(int a[], int b[]) {

		if (a.length == b.length) {

			for (int i = 0; i < a.length; i++) {

				if (a[i] != b[i]) {
					status = false;
					break;

				} else {
					status = true;

				}
			}
			if (status == true) {
				System.out.println("Arrays are equals");
			} else
				System.out.println("Arrays are not equals");

		} else {
			System.out.println("Arrays are not equal, Size mismatch");
		}

	}

}
