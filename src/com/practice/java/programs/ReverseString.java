package com.practice.java.programs;

import java.util.Scanner;

public class ReverseString {

	static String text;
	static String rev = "";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to be reverse :");
		text = sc.nextLine();

		System.out.println("Original String : " + text);

		reverseLogic3();
	}

	public static void reverseLogic1() {

		int ln = text.length();

		for (int i = ln - 1; i >= 0; i--) {

			rev = rev + text.charAt(i);

		}
		System.out.println("Reversed String : " + rev);
	}

	public static void reverseLogic2() {

		StringBuffer sb = new StringBuffer(text);
		StringBuffer rev = sb.reverse();

		System.out.println("Reversed String : " + rev);
	}

	public static void reverseLogic3() {

		char a[] = text.toCharArray();
		int ln = a.length;

		for (int i = ln - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println("Reversed String : " + rev);
	}

}
