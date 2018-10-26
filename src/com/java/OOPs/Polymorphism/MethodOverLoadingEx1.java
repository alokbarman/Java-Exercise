package com.java.OOPs.Polymorphism;

public class MethodOverLoadingEx1 {

	public static void main(String[] args) {
		MethodOverLoadingEx1 obj=new MethodOverLoadingEx1();
		
		obj.sum(10, 20);
		
		obj.sum(10, 20, 30);
		obj.sum(10.05, 15.20);
		obj.sum(10.05f, 15.20f);
		double c = obj.sum(20, 20.1);
		System.out.println(c);

	}

	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	void sum(double a, double b){
		System.out.println(a+b);
		}
		
	void sum(float a, float b){
	System.out.println(a+b);
	}
	      double sum(int a, double b) {
	    	  double c= a+b;
	    	  return c;
	}

}
