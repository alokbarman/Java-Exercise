package com.java.questionssolution;

//Write a program in Java to make such a pattern like right angle triangle with number increased by 1.

import java.util.Scanner;

public class RightAngleTriangleWithIncreasedNumber {

	public static void main(String[] args) {
		int i,j,number;
		int k=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number of rows: ");
		number=sc.nextInt();
		sc.close();
		
		for(i=1;i<=number;i++) {
			for(j=1;j<=i;j++)
				System.out.print(k++);
			    System.out.println(" ");
		}

	}

}
