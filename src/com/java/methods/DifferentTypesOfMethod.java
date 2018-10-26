package com.java.methods;


public class DifferentTypesOfMethod {
 static int tmp=10;
 
	public static void main(String[] args) {
		count1(100);
		count2(200);
		count3(300);
	    count5("BD Tech");
		DifferentTypesOfMethod obj=new DifferentTypesOfMethod();
		obj.count4(400);

	}
public static void count1(int a) {
	int p=tmp+a;
	System.out.println("count1 p: "+p);
}
public static void count2(int a) {
	int p=tmp+a;
	System.out.println("count2 p: "+p);
	
}
public static void count3(int a) {
	
	int p=tmp+a;
	System.out.println("count3 p: "+p);
}
public void count4(int a) {
	
	int p=tmp+a;
	System.out.println("count4 p: "+p);
}
public static void count5(String b) {
	String c;
	c=b;
	System.out.println("school name:"+c);
	
}
}