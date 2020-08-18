package com.practice.java.programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check :");
		int num = sc.nextInt();
		reverseLogic1(num);

	}

	// logic 1:
	// Check number is prime or not
	// number should be greater than 1 and it should has only two factors 1& itself

	public static void reverseLogic1(int num) {

		int count = 0;

		if (num > 0) {

			for (int i = 1; i <= num; i++) {

				if (num % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.println("Number is prime");
			} else {
				System.out.println("Number is not prime");
			}
		} else {
			System.out.println("Number is not prime");
		}

	}

	// logic 2:
	public static void reverselogic2(int num) {
		
		
		if (num > 0) {

			for (int i = 1; i <= num; i++) {

				if (num % i == 0) {
					System.out.println("Number is prime");
				}else
				{
					System.out.println("Number is not prime");
				}
					
			}
	}
	
}
}