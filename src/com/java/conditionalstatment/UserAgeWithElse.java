package com.java.conditionalstatment;

public class UserAgeWithElse {

	public static void main(String[] args) {
		
		userAge(61);
	}
	public static void userAge(int age) {
		if(age>=0 && age<18) {
			System.out.println("Teen User");
		}
		else if(age>=18 & age<=35) {
			System.out.println("Super User");
		}
		else if(age>=36 & age<=60) {
			System.out.println("Old User");
		}
		else {
			System.out.println("Senior User");
		}
	}

}
