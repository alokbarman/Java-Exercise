package com.java.questionssolution;

//Write a program in Java to make such a pattern like right angle triangle with a number which
//will repeat a number in a row.

import java.util.Scanner;

public class RightAngleTriangleWithRepeatNumber {

	public static void main(String[] args) {
		int i, j, number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number: ");
		number = sc.nextInt();
		sc.close();
		
		for (i = 1; i <= number; i++) {
			for (j = 1; j <= i; j++)
				System.out.print(i);
			System.out.println("");
		}

	}

}
