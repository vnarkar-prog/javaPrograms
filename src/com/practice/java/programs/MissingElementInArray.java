package com.practice.java.programs;

public class MissingElementInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 8 };
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < a.length; i++) {

			sum1 = sum1 + a[i];

		}
		System.out.println("sum1 is:" + sum1);

		for (int j = 1; j <= a.length + 1; j++) {

			sum2 = sum2 + j;
		}
		System.out.println("sum2 is:" + sum2);

		int missNo = sum2 - sum1;
		System.out.println("Missing number in array is :" + missNo);
	}

}
