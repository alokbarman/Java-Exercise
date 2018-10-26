package com.java.conditionalstatment;

public class UserAge {

	public static void main(String[] args) {
		
		 userAge(66);
	}
    static void userAge(int age) {
    	if (age>=18 && age<=34) {
    		System.out.println("superUser");
    	}
    	else if (age>=54 && age<=65) {
    		System.out.println("olderUser");
    	}
    	else if (age>=12 && age<=17) {
    		System.out.println("underAge");
    	}
    	else {
    		System.out.println("out of criteria");
    	}
    }
}
