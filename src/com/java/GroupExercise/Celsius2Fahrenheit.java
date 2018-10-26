package com.java.GroupExercise;

import java.util.Scanner;

public class Celsius2Fahrenheit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Celsius Temperature: ");
		double c = sc.nextDouble();
		sc.close();
		double fahrenheit = (c*9/5)+32;
		System.out.println(c+ " degree celcious = "+fahrenheit+ " degree fahrenheit");

	}

}
