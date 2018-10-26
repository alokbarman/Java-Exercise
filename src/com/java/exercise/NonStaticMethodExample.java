package com.java.exercise;

public class NonStaticMethodExample {
	    //static int m=7;
	    //static String name="Alok Barman";
	    
	public static void main(String[] args) {
		//int a=2;
		//int b=3;
		//int c=a+b;
		//System.out.println(c);
		//System.out.println(m +" " +name);
		
		String str="i am alok";
		System.out.println(str);
		//roll(5);
		NonStaticMethodExample obj=new NonStaticMethodExample();
		obj.roll(123);
	}
    /*public void roll(int n) {
    	int m=20;
    	int p=10;
    	n=m+p;
    	System.out.println("value of n: "+n);
    }*/
	
	 public void roll(int n) {
	    	int m=n;
	    	int p=10;
	    	n=m+p;
	    	System.out.println("value of n: "+n);
	    }
}
