package com.practice.java.programs;

public class PalindromeNumber {

	static int num;
	static int rev;

	public static void main(String[] args) {

		num = 12421;
		int ogNum = num;
		System.out.println("orignal number is : " + num);

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("reversed number is : " + rev);

		if (ogNum == rev) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
	}

}
