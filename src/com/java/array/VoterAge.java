package com.java.array;
/*1. Write Java program to allow the user to input his/her age. Then the
program will show if the person is eligible to vote. A person who is
eligible to vote must be older than or equal to 18 years old.*/
public class VoterAge {

	public static void main(String[] args) {
		voterAge(17);

	}
	public static void voterAge(int age) {
		
		if (age>=18) { 
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println("Not eligible for vote");
		}
	}

}
