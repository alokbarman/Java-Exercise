package com.java.conditionalstatment;
//(Answer of the question no 2.)

public class Grading {

	public static void main(String[] args) {
		grade(101);

	}
	static void grade(int marks) {
		if (marks>=90 && marks<=100) {
			System.out.println("Grade A");
		}
		else if(marks>=80 && marks<=89) {
			System.out.println("Grade B");
		}
		else if(marks>=70 && marks<=79) {
			System.out.println("Grade C");
		}
		else if(marks>=60 && marks<=69) {
			System.out.println("Grade D");
		}
		else if(marks>100) {
			System.out.println("Extra Credit/Out of range");
		}
		else {
			System.out.println("Fail");
		}
	}
}