package com.java.staticblock;

public class StaticTest {
	
	
	    static int i;
	    int j;
	    static String str;
	     
	    // start of static block 
	    static {
	        i = 10;
	        str = "static block test";
	        System.out.println("static block called ");
	    }
	    // end of static block 
	}
	 
	


