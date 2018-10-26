package com.java.GroupExercise;

import java.util.Scanner;

//1. Write a Java program to get a number from the user and print whether it is positive or negative.

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a integer number: ");
		int num=sc.nextInt();
		sc.close();
		if(num>0) {
			System.out.println("This is a positive number");
		}
		else if(num<0){
			System.out.println("This is a negative number");
		}
		else {
			System.out.println("This is not a positive or negative number");
		}
		

	}

}
