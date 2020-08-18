package com.practice.java.programs;

public class EvenOddArray {

	public static void main(String[] args) {

		int a[] = { 1, 4, 3, 5, 61, 9, 4, 6, 7 };

		System.out.println("Even nos in array are: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}		
		}
		System.out.println();
		System.out.println("Odd nos in array are: ");
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {
				System.out.print(a[i] + " ");
			}
		}

	}

}
