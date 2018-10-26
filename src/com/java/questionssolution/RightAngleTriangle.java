package com.java.questionssolution;

//Write a program in Java to display the pattern like right angle triangle with a number.

import java.util.Scanner;

public class RightAngleTriangle {

	public static void main(String[] args) {
		int i, j, number;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a number: ");
		number=sc.nextInt();
		
		sc.close();
		for(i=1; i<=number; i++) {
			for(j=1; j<=i; j++) 
				System.out.print(j);
				System.out.println("");
			
		}

	}

}
