package com.practice.java.programs;

public class Swap2Number {

	static int a = 25;
	static int b = 55;

	public static void main(String args[]) {

		System.out.println("Before Swapping a =" + a + "; b=" + b);

		logic5();

		System.out.println("After Swapping a =" + a + "; b=" + b);
	}

	public static void logic1() {

		int c;
		c = a;
		a = b;
		b = c;

	}

	public static void logic2() {

		a = a * b;
		b = a / b;
		a = a / b;
	}

	public static void logic3() {

		a = a + b;
		b = a - b;
		a = a - b;
	}

	public static void logic4() {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
	}

	public static void logic5() {

		b = a + b - (a = b);
	}
}
