package com.java.GroupExercise;

import java.util.Scanner;

public class VowelAndConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a charecter: ");
		char ch = sc.nextLine().charAt(0);
		sc.close();
		
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U' ) {
			System.out.println(ch+ " is a vowel");
		}
		
		else if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z')) { 
			System.out.println(ch+ " is a consonant");
		}
		else if(!Character.isLetter(ch)) {
			System.out.println(ch +" is not a alphabet");
		}
		

	}

}
