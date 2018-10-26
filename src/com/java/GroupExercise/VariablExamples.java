package com.java.GroupExercise;

public class VariablExamples {
	// instance variable
	// static variable
	// Local variable
	
	int a=10; // instance variable // Global variable
	static int b=30; // static variable // Global variable
	
	
	// static method
	// Non-static method
	// Return-type method
	
	public int sum() { // Return type method
		int a=20;  // Local variable
		return a;	
	}
	public int sum(int b) { // Return type method // Parameterized method // 1 argument
		int a=20;  // Local variable
		int c=a+b;
		return c;	
	}
	
	public void sub() { // Non-static method
		
		int a=20; // Local variable
		System.out.println(a);
		
	}
	public void sub(int a, int b) { // Non static method //Parameterized method // 2 arguments
		
		int c=a*b;
		System.out.println(c);
	}
	public static void div() {  // static method
		int x=12;
		int y= x+b;
		System.out.println(y);
	}
	public static void div(int x) {  // static method // Parameterized method

		int y= x+b;
		System.out.println(y);
	}
	
	
	
	

}

  
