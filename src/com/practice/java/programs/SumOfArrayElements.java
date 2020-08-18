package com.practice.java.programs;

public class SumOfArrayElements {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 9, 4, 5, 6 };

		int sum = 0;

//		for (int i = 0; i < arr.length; i++) {
//
//			sum = sum + arr[i];
//
//		}
//		System.out.println("Sum of elements in array is: " + sum);

		// using enhanced for loop
		for (int j : arr) {
			sum = sum + j;
		}
		System.out.println("Sum of elements in array is: " + sum);
	}

}
