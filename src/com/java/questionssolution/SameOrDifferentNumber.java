package com.java.questionssolution;
//Write a Java program that reads in two floating-point numbers and tests whether they are the
//same up to three decimal places.
import java.util.Scanner;
public class SameOrDifferentNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first floating-point number: ");
		float number1=scan.nextFloat();
		System.out.println("Enter the second floating-point number: ");
		float number2=scan.nextFloat();
		scan.close();
		
		if(Math.abs(number1-number2)<=0.01) {
			System.out.println("The numbers are same");
		}
		else {
			System.out.println("The numbers are different");
			
		}

	}

}
