package com.java.OOPs.Polymorphism;

public class MethodOverLoadingEx2 {

	int sum(int a, int b) {
		int c= a+b;
		
		return c;
	}

	double sum(double a, double b) {
		double c = a+b;
		return c;
		
	}

	public static void main(String args[]) {
		MethodOverLoadingEx2 obj = new MethodOverLoadingEx2();
		int c = obj.sum(20, 20); // Compile Time Error
		System.out.println(c);
	}

}
