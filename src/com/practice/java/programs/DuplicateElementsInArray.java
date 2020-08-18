package com.practice.java.programs;

import java.util.HashSet;

public class DuplicateElementsInArray {

	static boolean flag = false;

	public static void main(String[] args) {

		String[] a = { "Thane", "Dom", "Va", "Vashi", "Dombivli", "Kalyan" };
		logic2(a);

	}

	public static void logic1(String arr[]) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println("Duplicate element found: " + arr[i]);
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("No Duplicates");
		}
	}

	public static void logic2(String arr[]) {

		HashSet<String> hs = new HashSet<String>();

		for (String l : arr) {

			if (hs.add(l) == false) {
				System.out.println("Duplicate Element found :" + l);
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("No Duplicates");
		}

	}

}