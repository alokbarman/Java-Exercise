package com.java.staticblock;

public class StaticMain {
	
	
	    public static void main(String args[]) {
	 
	        // Although we don't have an object of Test, static block is 
	        // called because i is being accessed in following statement.
	        System.out.println(StaticTest.i);
	        System.out.println(StaticTest.str);
	    }
	}


