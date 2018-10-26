package com.java.GroupExercise;

public class QuardeticEquationWithoutScanner {

	public static void main(String[] args) {
		int a=1;
		int b=5;
		int c=1;
		int n=(b*b-4*a*c);
		double root1;
		double root2;
		if(n==0) {
			root1=(-b)/2*a;
			root2=-b/2*a;
			System.out.println("The roots are: "+ root1);
		}
		else if(n>0) {
			root1=(-b+Math.sqrt(n))/2*a;
			root2=(-b-Math.sqrt(n))/2*a;
			System.out.println("The roots are: "+ root1+ " and "+ root2);
		}

	}

}
