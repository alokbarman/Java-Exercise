package com.java.questionssolution;

//Write a Java program that takes a year from user and print whether that year is a leap year or not.

import java.util.Scanner;

public class LeapYearTest {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		
		int year=scan.nextInt();
		
		scan.close();
		
		if(year%4==0 ||(year%100!=0 && year%400==0)) {
			System.out.println(year+" is a Leap Year");
		}
		else {
			System.out.println(year+" is not a Leap Year");
		}
//||Called Logical OR Operator.If any of the two operands are non-zero,then the condition becomes true.
	}

}
