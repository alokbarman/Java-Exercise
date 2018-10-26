package com.java.methods;

public class MethodArgumentExample {

	public static void main(String[] args) {
		String a="nilav";
		String b="ray";
		System.out.println(a+" "+b);
		
		name("alok","barman");
		
		String str=name1("parimal sarkar");
		System.out.println(str);
		
	}
	
    public static void name(String firstName, String lastName) {
    	
    	String f;
    	String l;
    	f=firstName;
        l=lastName;
        System.out.println(f+" "+l);
	     
    }
    public static String name1(String c) {
    	String p;
    	p=c;
    	
    	return p;
    	
    }
}
