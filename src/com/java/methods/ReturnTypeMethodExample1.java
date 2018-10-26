package com.java.methods;

public class ReturnTypeMethodExample1 {
	int tap =10;
	static int pc;

	public static void main(String[] args) {
	int c=10;
	int d=15;
	int b=test();
	int f=c+d+b;
	System.out.println(f);
	
	int z=test3(100);
	System.out.println(z);
	System.out.println(z*f);
	
	int n=test4(200);
	System.out.println(n);
	
	String bt= a(123);
	System.out.println(bt);

	}
    public static int test() {
	int c=6;
	return c;
}
    public static int test3(int m) {
    	int p=10;
    	int q=p+m;
    	return q;
    }
    public static int test4(int n) {
    	int r=5;
    	int s=10;
    	int t=r*s*n;
    	return t;
    }
    public static String a(int id) {
    	System.out.println("My id is" +id);
    	String str="My name is Alok";
    	String w="Hi";
    	return w;
    }
}
