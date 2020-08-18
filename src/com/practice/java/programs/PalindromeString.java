package com.practice.java.programs;

import java.util.Scanner;

public class PalindromeString {

	static String inString;
	static String rev = "";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		inString = sc.nextLine();

		String oString = inString;

		reverse();

		if (oString.equals(rev)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

	public static void reverse() {

		int ln = inString.length();

		for (int i = ln - 1; i >= 0; i--) {

			rev = rev + inString.charAt(i);

		}
		System.out.println("reverse is :" + rev);

	}

}
