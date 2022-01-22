package com.bam.chapter08;

public class turing {

	public static void main(String[] args) {
		
		int[] nums = new int[30];
		int max_num = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			
			if (nums[i] > max_num) {
				max_num = nums[i];
			}
			
		}
			
		System.out.println(max_num);
	}
}
