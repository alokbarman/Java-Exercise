package com.java.GroupExercise;

import java.util.Scanner;

public class Fahrenheit2Celsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fahrenheit Temperature: ");
		double f=sc.nextDouble();
		sc.close();
		double celsius = (f-32)*5/9;
		System.out.println(f+ " degree fahrenheit  = "+celsius+ " degree celsius");

	}

}
