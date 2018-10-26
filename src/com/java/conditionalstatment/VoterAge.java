package com.java.conditionalstatment;

public class VoterAge {

	public static void main(String[] args) {
		VoterAge obj=new VoterAge();
		obj.voterAge(100);

	}
	public void voterAge(int age) {
		if(age>0 && age<18) {
			System.out.println("Not Elegible for Vote");
		}
		else if(age>=18) {
			System.out.println("Elegible for Vote");
		}
	}

}
