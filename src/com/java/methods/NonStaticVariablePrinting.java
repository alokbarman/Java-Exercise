package com.java.methods;

public class NonStaticVariablePrinting {
  
	int mangoPrice=1;
	String fruit1="Mango";
	double orangePrice=2;
	String fruit2="Orange";
	float appleprice=3;
	String fruit3="Apple";
	
	static int roll1=9;
	static String name="Shohag";
	
	public static void main(String[] args) {
		int roll2=10;
		String str="Alok";
		
		NonStaticVariablePrinting obj = new NonStaticVariablePrinting();
		
		System.out.println(obj.fruit1+"=" +obj.mangoPrice);
		System.out.println(obj.fruit2+"=" +obj.orangePrice);
		System.out.println(obj.fruit3+"=" +obj.appleprice);
		
		System.out.println("Roll Number:"+roll1);
		System.out.println("Name:"+name);
		
		System.out.println("Roll Number:"+roll2+"," +"Name: "+str);

	}

}
