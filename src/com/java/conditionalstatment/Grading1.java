package com.java.conditionalstatment;

public class Grading1 {

	public static void main(String[] args) {
		grade(101);

	}
	public static void grade(int marks) {
		if(marks>=80 && marks<=100) {
			System.out.println("Grade A+");
		}
		else if(marks<80 & marks>=70) {
			System.out.println("Grade A");
		}
		else if(marks<70 & marks>=60) {
			System.out.println("Grade A-");
		}
		else if(marks<60 & marks>=50) {
			System.out.println("Grade B");
		}
		else if(marks<50 & marks>=40) {
			System.out.println("Grade B-");
		}
		else if(marks<40 & marks>=33) {
			System.out.println("Grade C");
		}
		else if(marks<33 & marks>=0) {
			System.out.println("Grade F");
		}
		else {
			System.out.println("Out of Criteria");
		}
		
	}

}
