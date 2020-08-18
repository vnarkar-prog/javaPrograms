package com.practice.java.programs;

import java.util.Scanner;

public class NumberAddition {

	public static void main(String[] args) {

		// 1234 = 1+2+3+4=10

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();

		int rem;
		int add = 0;

		while (num != 0) {

			rem = num % 10;
			add = add + rem;
			num = num / 10;
		}

		System.out.println("Sum of digits in given number is: " + add);

	}

}
