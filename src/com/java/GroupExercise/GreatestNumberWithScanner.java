package com.java.GroupExercise;

import java.util.Scanner;

public class GreatestNumberWithScanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Input 1st integer number: ");
		int num1=scan.nextInt();
		System.out.println("Input 2nd integer number: ");
		int num2=scan.nextInt();
		System.out.println("Input 3rd integer number: ");
		int num3=scan.nextInt();
		scan.close();
		if(num1>num2 && num1>num3) {
			System.out.println("The greatest number is: "+num1);
		}else if(num2>num3) {
			System.out.println("The greatest number is: "+num2);
		}else {
			System.out.println("The greatest number is: "+num3);
		}

	}

}
