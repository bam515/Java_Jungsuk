package com.bam.chapter04;

public class Exercise4_6 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 6) + 1;
		int b = (int) (Math.random() * 6) + 1;
		
		boolean term = true;
		
		while (term) {
			if (a + b == 6) {
				System.out.printf("a + b = %d%n", a + b);
				break;
			} else {
				term = false;
			}
		}
	}
}
