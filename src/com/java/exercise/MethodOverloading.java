package com.java.exercise;

public class MethodOverloading {

	public static void main(String[] args) {
		
		addition();
		addition(50);
		addition(55,25);
		MethodOverloading obj=new MethodOverloading();
		obj.addition1();
		
	}
	
static void addition() {
	int a=20;
	int b=30;
	int c=a+b;
	System.out.println("Value of c: "+c);
}

static void addition(int x) {
	int a=20;
	int b=x;
	int d=a+b;
	System.out.println("Value of d: "+d);
}
static void addition(int x,int y) {
	int a=y;
	int b=x;
	int p=a+b;
	System.out.println("Value of p: "+p);
}
void addition1() {
	int a=20;
	int b=30;
	int c=a+b;
	System.out.println("Value of c: "+c);
}
}
