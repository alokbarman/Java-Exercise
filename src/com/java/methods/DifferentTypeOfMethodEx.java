package com.java.methods;

public class DifferentTypeOfMethodEx {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
				
		int m= functoin1(9,11);
		int n = calculation(20);
		int cal = a+b+m;
		int cal1=a+b+n;
        System.out.println(cal);
        System.out.println(cal1);
	}
    public static int functoin1(int a,int b) {
    	int c;
    	int d;
    	c=a+b;
    	d=a+b+c;
    	return d;
    }
    
    static int calculation(int t) {
    	return t;
    }
}
