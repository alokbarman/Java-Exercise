package com.java.methods;

public class StaticMethodExample {
	int a=30;
	int b=40;
	int c=50;
    int d=10;
    int f=15;
    int g=20;
    
	public static void main(String[] args) {
		addition(30,10);
		addition1(40,15);
		addition2(50,20);
		
	}
    public static void addition(int a,int d) {
    	
    	int h=a+d;
    	System.out.println("Value of h=" +h);
    }
    public static void addition1(int b,int f) {
    	int i=b+f;
    	System.out.println(i);
    }
    public static void addition2(int c,int g) {
    	int j=c+g;
    	System.out.println(j);
    }
}
