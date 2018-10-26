package com.java.GroupExercise;

//8. Write a program in Java to display the cube of the number up to given an integer.

import java.util.Scanner;

public class CubicEquation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		scan.close();
		for(int i=1; i<=num; i++) {
			System.out.println("Number is: "+i+" and cube of "+i+" is: "+(i*i*i));
		
		}
		 //System.out.println("Cube of num is: "+num*num*num);
	}

}
