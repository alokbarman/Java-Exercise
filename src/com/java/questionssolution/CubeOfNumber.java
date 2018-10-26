package com.java.questionssolution;

//Write a program in Java to display the cube of the number up to given an integer.

import java.util.Scanner;

public class CubeOfNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Input number of terms: ");
		int n=scan.nextInt();
		scan.close();
		for(int i=1;i<=n;i++) {
			System.out.println("Number is: "+i+". And cube of i is: "+(i*i*i));
		}

	}

}
