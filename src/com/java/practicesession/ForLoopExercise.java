package com.java.practicesession;

public class ForLoopExercise {
	//Write a Java program by using two for loops to produce the output shown below:

	public static void main(String[] args) {
		String s="*****";
		int len=s.length();
		String rev=" ";
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			System.out.println(rev);
		}

	}

}
