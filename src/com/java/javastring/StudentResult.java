package com.java.javastring;
/*5.A student conducted 76, 82, 89, 92, 72 in various subject. Write a java program to display total
numbers and percentile average of total in two separate methods.*/
public class StudentResult {
	int a=76;
	int b=82;
	int c=89;
	int d=92;
	int f=72;
	int t;

	public static void main(String[] args) {
		StudentResult obj=new StudentResult();
		obj.marksAddition();
		obj.marksAvarage();
	}
	public void marksAddition() {
		
		t=a+b+c+d+f;
		System.out.println(t);
	}
	public void marksAvarage() {
		float m;
		m=t/5;
		System.out.println("Percentile Avarage ="+m+"%");
		
	}

}
