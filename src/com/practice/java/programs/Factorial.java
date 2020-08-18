package com.practice.java.programs;

public class Factorial {
	// 5!=5*4*3*2*1
	static long fact1, fact2;
	static int num;

	public static void main(String[] args) {

		num = 8;
		fact1 = 1;
		fact2 = 1;

		for (int i = num; i > 0; i--) {

			fact1 = fact1 * i;

		}
		System.out.println("Factorial of given number is " + fact1);

		for (int i = 1; i <= num; i++) {

			fact2 = fact2 * i;

		}
		System.out.println("Factorial of given number is " + fact2);
	}

}
