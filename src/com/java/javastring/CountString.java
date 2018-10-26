package com.java.javastring;

/*9.Write a java program which will count the number of vowels, consonants, digits, tabs and blank spaces 
from a string “A quick brown fox jumps over the lazy dog”.*/

public class CountString {

	public static void main(String[] args) {
		
		String s="A quick brown fox jumps over the lazy dog";
				System.out.println(s.length());
				
		for(int i=0;i<s.length();i++) {
			System.out.println(s);
			System.out.println(s.charAt(3));
			/*if(s.charAt()==a) {
				System.out.println("Vowel");
			}*/
		}			

	}

}
