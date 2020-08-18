package com.practice.java.programs;

public class LargestOfThree {

	public static void main(String[] args) {

		int a = 90;
		int b = 90;
		int c = 30;
		/*
		 * if(a>b && a>c) { System.out.println("A is greater"); }else if(b>c) {
		 * System.out.println("B is Greater"); }else {
		 * System.out.println("C is greater"); }
		 */
		// logic 2 : Using ternary operator

		int largest1 = a > b ? a : b;
		int largest2 = c > largest1 ? c : largest1;

		System.out.println("largest number is:" + largest2);

	}

}
