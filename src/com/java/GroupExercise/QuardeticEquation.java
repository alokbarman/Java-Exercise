package com.java.GroupExercise;

//2. Write a Java program to solve quadratic equations (use if, else if and else).

import java.util.Scanner;

public class QuardeticEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer number a: ");
		int a = sc.nextInt();
		System.out.println("Input an integer number b: ");
		int b = sc.nextInt();
		System.out.println("Input an integer number c: ");
		int c = sc.nextInt();
		sc.close();
		int n = (b*b-4*a*c);
		double root1;
		double root2;
		if(n==0) {
			root1=-b/2*a;
			root2=-b/2*a;
			System.out.println("The roots of the equation is: "+ root1);
		}
		else if(n>0) {
			root1= (-b+Math.sqrt(n))/2*a;
			root2= (-b-Math.sqrt(n))/2*a;
			System.out.println("The roots of the equation is: "+ root1+ " and "+ root2);
		}
		else {
			System.out.println("The equation has no real roots");
		}

	}

}
