package com.java.questionssolution;

import java.util.Scanner;

//Write a Java program to solve quadratic equations (use if, else if and else).

public class quadraticEquations {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a: ");
		double a=scan.nextDouble();
		System.out.println("Enter b: ");
		double b=scan.nextDouble();
		System.out.println("Enter c: ");
		double c=scan.nextDouble();
		double d=(b*b-4.0*a*c);
		scan.close();
		if(d>0.0) {
			double root1=(-b+Math.sqrt(d))/2.0*a;
			double root2=(-b-Math.sqrt(d))/2.0*a;
			System.out.println("The roots are: "+root1+ " and"+ root2);
		}
		else if(d==0.0) {
			double root1=(-b/2.0*a);
			//double root2=(-b/2.0*a);
			System.out.println("The roots of the equation is: "+root1);
		}
		else {
			System.out.println("The equation has no real roots");
		}
		

	}

}
