package com.java.GroupExercise;

import java.util.Scanner;

public class SameOrDifferentNumber {
	//Write a Java program that reads in two floating-point numbers and tests whether they
	//are the same up to three decimal places.
	//A float data type in Java stores a decimal value with 6-7 total digits of precision.
    //example 12.12345
	public static void main(String[] args) { 
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a float number num1: ");
		float num1=input.nextFloat();
		System.out.println("Enter a float number num2: ");
		float num2=input.nextFloat();
		input.close();
		
		if(Math.abs((num1-num2))<0.001) {
			System.out.println("Those number are same");
		}
		else {
			System.out.println("Both number are different");
		}

	}

}
