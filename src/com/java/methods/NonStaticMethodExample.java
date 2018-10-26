package com.java.methods;

public class NonStaticMethodExample {
	public static void main(String[] args) {
		
		NonStaticMethodExample obj=new NonStaticMethodExample();
		obj.studentInfo("Alok", 40);
		obj.studentInfo("Shohag", 30);
		obj.studentInfo("Shourav", 25);
    	
	}
   public void studentInfo(String name,int a) {
	   String str=name;
	   
	   System.out.println("Student name: "+str+ " ; " +"Age: "+a);
	   
   }
   
}