package com.bam.chapter05;

public class Exercise5_4 {

	public static void main(String[] args) {
		int[][] arr = {
				{ 5, 5, 5, 5, 5 },
				{ 10, 10, 10, 10, 10 },
				{ 20, 20, 20, 20, 20 },
				{ 30, 30, 30, 30, 30 }
		};
		
		int total = 0;
		int tmp = 0;
		float average = 0.0f;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
			tmp += arr[i].length;
		}
		
		average = total / (float)tmp;
				
		System.out.println("total = " + total);
		System.out.println("average = " + average);
	}
}
