package com.practice.java.programs;

public class LinearSearch {

	public static void main(String[] args) {

		int arr[] = { 20, 60, 30, 10, 40, 50 };

		int src_element = 110;
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == src_element) {
				System.out.println("Duplicate element found is: " + arr[i] + " & found at position: " + i);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("No Duplicate elements found");
		}

	}

}
