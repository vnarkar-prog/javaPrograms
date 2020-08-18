package com.practice.java.programs;

public class FindOddEven {

	static int cOdd;
	static int cEven;
	static int rem;

	public static void main(String[] args) {
		// program to find how many odd number and even number present in given number

		int num = 1111;

		while (num > 0) {
			rem = num % 10;
			if (rem % 2 == 0) {

				cEven++;

			} else {

				cOdd++;

			}
			num = num / 10;

		}
		System.out.println("Even Numbers are :" + cEven);
		System.out.println("Odd Numbers are :" + cOdd);
	}

}
