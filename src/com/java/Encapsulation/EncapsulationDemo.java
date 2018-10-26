package com.java.Encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		EncaptulationExample obj=new EncaptulationExample();
		
		obj.setEmpSSN(1112222222);
		int ssn=obj.getEmpSSN();
		
		System.out.println(ssn);
		
		obj.setEmpName("Alok");
		String str=obj.getEmpName();
		
		System.out.println(str);
		
		obj.setEmpAge(40);
		int age=obj.getEmpAge();
		
		System.out.println(age);
		
	}

}
