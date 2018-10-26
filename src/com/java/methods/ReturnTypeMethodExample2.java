package com.java.methods;

public class ReturnTypeMethodExample2 {

	public static void main(String[] args) {
		
		int a=5;
		int b=10;
		int c=a*b*recallValue(10);
		int d=a*b*recallValue(5);
		
		int r = recallValue(10);
		System.out.println("value of y " +r);
		
		System.out.println(c);
		System.out.println(d);

	}

	public static int recallValue (int sub) {
		int v=20;
		int y=v/sub;
		return y;
	}
	
}
