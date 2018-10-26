package com.java.conditionalstatment;

public class ConditionalStatement1 {

	public static void main(String[] args) {
		   peopleAge(100);
			
		}
		
		static void peopleAge(int age) {
			
			
			if (age>0 && age<= 12) {
				System.out.println("People are Child");
			}
			else if (age>12 && age<= 19) {
				System.out.println("People are Teen");	
			}
			else if (age>19 && age<= 49) {
				System.out.println("People are Adult");	
		}
			else if (age>50 && age<= 100) {
				System.out.println("People are Sineors");
	}
			else {
				System.out.println("People are not in the list");
			}
		}
}


