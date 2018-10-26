package com.java.GroupExercise;

//4. Write a Java program to find the number of days in a month.

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int days_In_month=0;
		String monthName="Unknown";
	
		System.out.println("Enter a month: ");
		int month=sc.nextInt();
		System.out.println("Enter a year: ");
		int year=sc.nextInt();
		sc.close();
		
		switch(month) {
		case 1:
			monthName="January";
			days_In_month=31;
			break;
		case 2:
			monthName="February";
			if(year%4==0||(year%100!=0 && year%400==0)) {
				days_In_month=29;
			}
			else {
				days_In_month=28;
			}
			break;
		case 3:
			monthName="March";
			days_In_month=31;
			break;
		case 4:
			monthName="April";
			days_In_month=30;
			break;
		case 5:
			monthName="May";
			days_In_month=31;
			break;
		case 6:
			monthName="June";
			days_In_month=30;
			break;
		case 7:
			monthName="July";
			days_In_month=31;
			break;
		case 8:
			monthName="August";
			days_In_month=31;
			break;
		case 9:
			monthName="September";
			days_In_month=30;
			break;
		case 10:
			monthName="October";
			days_In_month=31;
			break;
		case 11:
			monthName="November";
			days_In_month=30;
			break;
		case 12:
			monthName="December";
			days_In_month=31;
			//default:
				//System.out.println("This is not a month");
		}
		System.out.println("Month name is: "+monthName+ " and days in month is: "+days_In_month+" days");

	}

}
