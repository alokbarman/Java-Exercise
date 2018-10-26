package com.java.methods;

public class StaticMethodExample2 {

	public static void main(String[] args) {

		int t=addition(5);
		int t1=substraction(480);
		float t2=substract(480);
		int t3=multiplication(5);
		double t4=dividation(4);
		
		System.out.println("Value of w = "+t);
		System.out.println("Value of b = "+t1);
		System.out.println("Value of b = "+t2);
		System.out.println("Value of w= "+t3);
        System.out.println("Value of c= "+t4);
	}
	public static int addition(int h) {
		int a=10;
		int d=8;
		int w=a+d+h;
		return w;
	}
	public static int substraction(int a) {
		int b=a-a*10/100;
		return b;
	}
	public static float substract(float a) {
		float m=a*10/100;
		float b=a-m;
		return b;
	}
	public static int multiplication(int c) {
		int a=12;
		int b=8;
		int w=a*b*c;
		return w;
	}
	public static double dividation(double b) {
		double a=500;
		double c=a/b;
		return c;
		
	}
}