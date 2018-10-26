package com.java.questionssolution;

//Write a Java program to find the number of days in a month.

import java.util.Scanner;

public class DateOfMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number_of_daysInMonth = 0;
		String nameOfMonth = "Unknown";

		System.out.println("Input number of month: ");
		int month = sc.nextInt();

		System.out.println("Input a year: ");
		int year = sc.nextInt();
		sc.close();

		switch (month) {
		case 1:
			nameOfMonth = "January";
			number_of_daysInMonth = 31;
			break;
		case 2:
			nameOfMonth = "February";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				number_of_daysInMonth = 29;
			} else {
				number_of_daysInMonth = 28;
			}
			break;
		case 3:
			nameOfMonth = "March";
			number_of_daysInMonth = 31;
			break;
		case 4:
			nameOfMonth = "April";
			number_of_daysInMonth = 30;
			break;
		case 5:
			nameOfMonth = "May";
			number_of_daysInMonth = 31;
			break;
		case 6:
			nameOfMonth = "June";
			number_of_daysInMonth = 30;
			break;
		case 7:
			nameOfMonth = "July";
			number_of_daysInMonth = 31;
			break;
		case 8:
			nameOfMonth = "August";
			number_of_daysInMonth = 31;
			break;
		case 9:
			nameOfMonth = "September";
			number_of_daysInMonth = 30;
			break;
		case 10:
			nameOfMonth = "October";
			number_of_daysInMonth = 31;
			break;
		case 11:
			nameOfMonth = "November";
			number_of_daysInMonth = 30;
			break;
		case 12:
			nameOfMonth = "December";
			number_of_daysInMonth = 31;
		}
		
		System.out.println(nameOfMonth + " " + year + " has " + number_of_daysInMonth + " days\n");
		
	}

}
