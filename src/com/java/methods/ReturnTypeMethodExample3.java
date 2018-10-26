package com.java.methods;

public class ReturnTypeMethodExample3 {
	
	public static void main(String[] args) {
		
		int c = 10;
		int d = 15;
		int k =test(3);
		int f = c+d;
		
		System.out.println("printing f: "+f);
		System.out.println("printing k: "+k);
		
		String bt= getString("Alok");
		System.out.println("value of getstring = " +bt);
	}
	
	public static int test(int m) {
		
		int a=10;
		int b=a+m;
		return b;

	}
    public static String getString(String myName) {
    	
    	
    	String str;
    	 	str=myName;
    	 	
    	return str;
    }

} 
    