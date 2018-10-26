package com.java.GroupExercise;

import java.util.Scanner;

public class WeekDaysWithoutScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number to get the day: ");
		 int day = sc.nextInt();
		 sc.close();
		 
		//int day = 6;
		
		
		
		switch(day) {
		case 1:
			System.out.println("The 1st day of week is Monday");
			break;
		case 2:
			System.out.println("The 2nd day of week is Tuesday");
			break;
		case 3:
			System.out.println("The 3rd day of week is Wednesday");
			break;
		case 4:
			System.out.println("The 4th day of week is Thursday");
			break;
		case 5:
			System.out.println("The 5th day of week is Friday");
			break;
		case 6:
			System.out.println("The 6th day of week is Saturday");
			break;
		case 7:
			System.out.println("The Last day of week is Sunday");
			default: 

		}
	
	}

}
