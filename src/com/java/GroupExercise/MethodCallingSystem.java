package com.java.GroupExercise;

public class MethodCallingSystem {
	
	int a=10;
	static int b=30;
	

	public static void main(String[] args) {
		MethodCallingSystem object = new MethodCallingSystem();
		object.sub();
		object.sub(6, 8);
		div();
		div(7);
		int m= object.sum();
		System.out.println(m);
		int n = object.sum(3);
		System.out.println(n);
		
		//object.div(7);

	}
	public int sum() { 
		int a=20; 
		return a;
		
	}
	public int sum(int b) {
		int a=20;  
		int c=a+b;
		return c;	
	}
	
	public void sub() { 
		int a=20;
		int c= b-a;
		System.out.println(c);
		
	}
	public void sub(int a, int b) { 
		
		int c=a*b;
		System.out.println(c);
	}
	public static void div() {  
		int x=12;
		int y= x+b;
		System.out.println(y);
	}
	public static void div(int x) {  

		int y= x+b;
		System.out.println(y);
	}

}
