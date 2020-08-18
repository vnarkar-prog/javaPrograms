package com.practice.java.programs;

public class MinMaxArray {

	public static void main(String[] args) {

		int a[] = { 150, 40, 10, 60, 20 };

		int min = a[0];
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("The minimum value in array is: " + min);

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("The maximum value in array is: " + max);
	}

}
