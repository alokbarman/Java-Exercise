package com.java.questionssolution;

//Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

public class PositiveOrNegativeNumberByScanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=scan.nextInt();
		scan.close();
		
		if(number==0) {
			System.out.println("This is not a positive not a negative number");
		}
		else if(number>0) {
			System.out.println("This is a positive number");
		}
		else {
			System.out.println("This is a negative number");
		}

	}

}
