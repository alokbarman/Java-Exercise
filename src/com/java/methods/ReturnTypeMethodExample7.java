package com.java.methods;

public class ReturnTypeMethodExample7 {

public static void main(String[] args) {
		
		//int m=function1(50);
		//int n=function1(30);
		int subtraction=function1(50)-function2(30);
		System.out.println("Subtraction Value=" +subtraction);
	}
   public static int function1(int a) {
	   
	   return a;
	   
   }
    public static int function2(int b) {
    	return b;
    	
	}
}

