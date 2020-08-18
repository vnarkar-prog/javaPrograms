package com.practice.java.programs;

public class NumberInNumber {

	static int count;

	public static void main(String[] args) {

		int num = 123456;

		while (num != 0) {

			num = num / 10;
			count++;
		}

		System.out.println("Total digits are " + count);
	}

}
