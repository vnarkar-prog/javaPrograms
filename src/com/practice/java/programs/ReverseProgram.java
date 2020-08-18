package com.practice.java.programs;

import java.util.Scanner;

public class ReverseProgram {

	static int num;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be reversed : ");
		num = sc.nextInt();
		reverseLogic3();
		sc.close();

	}

	public static void reverseLogic1() {

		int rev = 0;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;

		}

		System.out.println("Number after reverse is :" + rev);
	}

	public static void reverseLogic2() {

		StringBuffer rev;

		StringBuffer sb = new StringBuffer(String.valueOf(num));
		rev = sb.reverse();

		System.out.println(rev);

	}

	public static void reverseLogic3() {

		StringBuilder sb = new StringBuilder(String.valueOf(num));
		StringBuilder rev = sb.reverse();
		
		System.out.println(rev);
	}

}
