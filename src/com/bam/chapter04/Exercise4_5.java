package com.bam.chapter04;

public class Exercise4_5 {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		
		while (i <= 10) {
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			j = 1;
		}
	}
}
