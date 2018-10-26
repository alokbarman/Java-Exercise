package com.java.Encapsulation;
public class EncapsulationEgTest {

	public static void main(String[] args) {
		
		EncapsulationEg obj=new EncapsulationEg();
		obj.setRoll(101);
		obj.setCode("Student");
		obj.setVal("New");
		
		System.out.println(obj.getCode());
		System.out.println(obj.getRoll());
		System.out.println(obj.getVal());

	}

}
