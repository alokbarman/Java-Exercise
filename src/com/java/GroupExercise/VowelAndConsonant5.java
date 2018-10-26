package com.java.GroupExercise;

import java.util.Scanner;

public class VowelAndConsonant5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter from english alphabet: ");
		String inputletter = scan.next();
		
		if (inputletter.length() == 1) {
			inputletter= inputletter.toLowerCase();
			if(inputletter.equals("a")|| inputletter.equals("e") ||inputletter=="i"|| inputletter=="o"||inputletter=="u") {
				System.out.println(inputletter+" is a vowel");
			}
			else {
				System.out.println(inputletter+ " is a consonant");
			}
			
		}
		else {
			System.out.println(inputletter+ " is not valid. You might have entered something other than a to z");
		}

	}

}
