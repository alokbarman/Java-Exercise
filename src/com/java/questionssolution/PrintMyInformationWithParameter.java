package com.java.questionssolution;

public class PrintMyInformationWithParameter {
	//Declare a method named takeAndPrintInfo() which will be take your name,age & job title as input & print them.

	public static void main(String[] args) {
		takeAndPrintInfo("Alok", 25, "QA");
		PrintMyInformationWithParameter obj=new PrintMyInformationWithParameter("Nilav", 30, "Prod");
		
		
		/*PrintMyInformationWithParameter constructor=new PrintMyInformationWithParameter(
				"Gautam",45, "Dev");*/

	}
	public static void takeAndPrintInfo(String name, int age, String jobTitle) {
		System.out.println("My Name: "+name);
		
		System.out.println("Age: "+age);
		System.out.println("Job Title: "+jobTitle);
	}
	public static void takeAndPrintInfo1(String name, int age, String jobTitle) {
		System.out.println("My Name: "+name);
		
		System.out.println("Age: "+age);
		System.out.println("Job Title: "+jobTitle);
	}
	
	public PrintMyInformationWithParameter(String name, int age, String jobTitle) {
        System.out.println("My Name: "+name);
		
		System.out.println("Age: "+age);
		System.out.println("Job Title: "+jobTitle);
	}
	

}
