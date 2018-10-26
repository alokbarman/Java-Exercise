package com.java.methods;


public class StaticMethodExample3 {

	public static void main(String args[]) {
		
		multiply(5);
		addition(4);
		subtraction(150);
		dividation(4);
		studentinfo(1,"Alok Barman");
		
		
		
	}
	public static void multiply(int a) {
		int h=10;
		int d=8;
		int s=a*h*d;
		System.out.println("Weekly Salary = "+ s+".");
	}
	public static void addition(int m) {
		int a=7;
		int o=8;
		int t= a+o+m;
		System.out.println("Total Fruit Price: "+ t+".");
	}
	public static void subtraction(int a) {
		int t=450;
		int b=t-a;
		System.out.println("Sum of b="+b+".");
	}
	public static void dividation(int n) {
		int t=1000;
		int a=t/n;
		System.out.println("Avarage amount of sum="+a);
	}
	public static void studentinfo(int a,String b) {
		int r;
		String n;
		r=a;
		n=b;
		System.out.println("Roll no: "+r+ ","+"Student name: "+n);
	}
	
}
