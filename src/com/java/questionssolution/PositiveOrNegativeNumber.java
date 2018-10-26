package com.java.questionssolution;

//Write a Java program to get a number from the user and print whether it is positive or negative.

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		int number=5;
		
        if(number==0) {
        	System.out.println("zero");
        }
        else if(number > 0)
        {
            System.out.println(number+" is positive number");
        }
        else
        {
            System.out.println(number+" is negative number");
        }
        
	}

}
