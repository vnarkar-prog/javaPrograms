package com.practice.java.programs;

import java.util.Random;

public class GenerateRandom_Numbers_Strings {

	public static void main(String[] args) {

		// logic 1 using Random
		logicTwo();
		// logic 2 using Math class
		// logic 3 Apache commons lang randomstringutils

	}

	public static void logicOne() {

		Random r = new Random();
		int i = r.nextInt(14);
		System.out.println(i);
	}
	
	public static void logicTwo() {

		double i=Math.random();
		System.out.println(i);
	}

}
