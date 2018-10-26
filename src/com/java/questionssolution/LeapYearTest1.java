package com.java.questionssolution;

import java.util.Scanner;

public class LeapYearTest1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Input a year: ");
		int year=scan.nextInt();
		scan.close();
		
		boolean a=(year%4==0);
		boolean b=(year%100!=0);
		boolean c=(year%400==0);
		
		if(a||(b && c)) { //&& (logical and), || (logical or)
			System.out.println(year+" is a Leap Year");
		}
		else {
			System.out.println(year+" is not a Leap Year");
		}

	}

}
