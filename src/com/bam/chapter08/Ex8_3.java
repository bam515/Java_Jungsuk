package com.bam.chapter08;

public class Ex8_3 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4);		// 실행되지 않는다.
		} catch (Exception e) {			// ArithmeticException대신 Exception을 사용.
			System.out.println(5);		
		} // end of try - catch
		
		System.out.println(6);
	} // end of main method
}
