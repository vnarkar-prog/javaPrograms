package com.practice.java.programs;

import java.util.Scanner;

public class DiffMinManArray {

	public static void main(String args[]) {

		int n, min, max;

		Scanner src = new Scanner(System.in);

		System.out.println("Enter number of elements in array");
		n = src.nextInt();

		int a[] = new int[n];

		System.out.println("Enter elements of array");

		for (int i = 0; i < n; i++) {
			a[i] = src.nextInt();
		}

		min = a[0];
		max = a[0];

		// find out max element in array
		for (int i = 0; i < n; i++) {
			if (a[i] > max)
				max = a[i];
		}
		// find out min element in array
		for (int i = 0; i < n; i++) {
			if (a[i] < min)
				min = a[i];
		}
		
		System.out.println("Max element in array is:" +max);
		System.out.println("Min element in array is:" +min);
		System.out.println("Difference is" +(max-min));
		
	}

}
