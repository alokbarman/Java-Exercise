package com.java.GroupExercise;

import java.util.Scanner;

public class SummationOfRandomNumbers {

	public static void main(String[] args) {
		
		int s=0;
		int totalNumbers=5;
		{
			System.out.println("Enter "+totalNumbers+ " random numbers: ");
		}
		for(int i=1;i<=totalNumbers;i++) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			sc.close();
			s += n;
			
			//System.out.println(s);
		}
		System.out.println(s);

	}

}
