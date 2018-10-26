package com.java.GroupExercise;

import java.util.Scanner;

//Write a program in Java to input 5 numbers from keyboard and find their sum and average.Test Data Input the 
//5 numbers: 1 2 3 4 5 Expected Output:

public class SumAndAvarage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number a: ");
		int a= sc.nextInt();
		System.out.println("Enter 2nd number b: ");
		int b= sc.nextInt();
		System.out.println("Enter 3rd number c: ");
		int c= sc.nextInt();
		System.out.println("Enter 4th number d: ");
		int d= sc.nextInt();
		System.out.println("Enter 5th number f: ");
		int f= sc.nextInt();
		sc.close();
		
		int sum = a+b+c+d+f;
		System.out.println("Sum of the numbers is= "+sum);
		
		double avg= sum/5;
		System.out.println("Avarage of the numbers is= "+avg);

	}

}
