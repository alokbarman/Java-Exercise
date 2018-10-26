package com.java.questionssolution;

public class PrintMyInformation {
	//Declare a method named myInfo() which will be print your name,email,phone numner,dob.

	public static void main(String[] args) {
		myInfo();
		PrintMyInformation obj= new PrintMyInformation();
		obj.myInfo1();
		System.out.println(obj.myInfo2("Parimal"));
		PrintMyInformation constructor= new PrintMyInformation();
		constructor.myInfo1();

	}
	public static void myInfo() {
		String name="Alok";
		String email="test1@gmail.com";
		int phoneNumber=2123456789;
		String dateOfBirth="01/01/1919";
		System.out.println("My Name: "+name);
		System.out.println("Email Address: "+email);
		System.out.println("Phone Number: "+phoneNumber);
		System.out.println("Date of Birth: "+dateOfBirth);
		System.out.println("**********my info***************");
	}
	
	public void myInfo1() {
		String name="Gautam";
		String email="test1@gmail.com";
		int phoneNumber=2123456789;
		String dateOfBirth="01/01/1919";
		System.out.println("My Name: "+name);
		System.out.println("Email Address: "+email);
		System.out.println("Phone Number: "+phoneNumber);
		System.out.println("Date of Birth: "+dateOfBirth);
		System.out.println("############### my info1 ####################");
	}
	public PrintMyInformation() {
		String name="Nilav";
		String email="test1@gmail.com";
		int phoneNumber=2123456789;
		String dateOfBirth="01/01/1919";
		System.out.println("My Name: "+name);
		System.out.println("Email Address: "+email);
		System.out.println("Phone Number: "+phoneNumber);
		System.out.println("Date of Birth: "+dateOfBirth);
		System.out.println("////////////////// constructor ///////////////////");
	}
	public String myInfo2(String name) {
		
		return name;
		
	}

}
