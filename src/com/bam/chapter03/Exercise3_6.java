package com.bam.chapter03;

public class Exercise3_6 {

	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (((float)5 / 9) * (fahrenheit - 32)) * 100 / 100;
		
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
	}
}
