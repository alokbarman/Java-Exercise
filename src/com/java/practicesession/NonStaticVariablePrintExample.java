package com.java.practicesession;

public class NonStaticVariablePrintExample {
	
	int a=20;
	String str="Alok";

	public static void main(String[] args) {
		NonStaticVariablePrintExample obj= new NonStaticVariablePrintExample();
		//System.out.println(a); //cannot call directly
		//System.out.println(str); //cannot call directly
		System.out.println(obj.a);
		System.out.println(obj.str);

	}

}
