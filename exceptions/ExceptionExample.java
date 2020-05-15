package com.exam.exceptions;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		try {
			int number = scn.nextInt();
			
			if (number == 0)
				throw new ZeroNumberException();
			
			if (number < 0)
				throw new NegativeNumberException();
			
			System.out.println("Positive Number");
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}

}
