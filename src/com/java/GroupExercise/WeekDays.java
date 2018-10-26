package com.java.GroupExercise;

//Write a Java program that keeps a number from the user and generates an integer
//between 1 and 7 and displays the name of the weekday.

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a number to get the day: ");
		int day=sc.nextInt();
		sc.close();
		
		switch(day) {
		case 1:
			System.out.println("1st day of week is: Monday");
			break;
		case 2:
			System.out.println("2nd day of week is: Tuesday");
			break;
		case 3:
			System.out.println("3rd day of week is: Wednesday");
			break;
		case 4:
			System.out.println("4th day of week is: Thursday");
			break;
		case 5:
			System.out.println("5th day of week is: Friday");
			break;
		case 6:
			System.out.println("6th day of week is: Saturday");
			break;
		case 7:
			System.out.println("Last day of week is: Sunday");
		}
	}
}
