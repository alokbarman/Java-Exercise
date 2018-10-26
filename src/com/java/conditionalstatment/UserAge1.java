package com.java.conditionalstatment;

public class UserAge1 {

	public static void main(String[] args) {
		
		userAge(100);
	}
	public static void userAge(int age) {
		if(age>=0 && age<18) {
			System.out.println("Teen User");
		}
		if(age>=18 && age<=35) {
			System.out.println("Super User");
		}
		if(age>35 & age<=60) {
			System.out.println("Old User");
		}
		if(age>60) {
			System.out.println("Senior User");
		}
	}

}
