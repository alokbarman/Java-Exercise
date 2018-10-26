package com.java.methods;

public class ReturnTypeMethodExample4 {

	public static void main(String[] args) {
		
    int m=function();
    
    System.out.println("Value of function is:"+m);
    
	}
    public static int function() {
    	int a=9;
    	int b=11;
    	int c=a*b;
    	return c;
    }
}
