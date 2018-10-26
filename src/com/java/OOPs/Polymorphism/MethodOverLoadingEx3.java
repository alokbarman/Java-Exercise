package com.java.OOPs.Polymorphism;

public class MethodOverLoadingEx3 {
	
	int sum(int a, int b){
		return a;
	 
	  } 
	
	 /* double sum(int a, int b){
		  return b;
	  
	  }*/  
	  public static void main(String args[])
	  {  
		  MethodOverLoadingEx3 obj=new MethodOverLoadingEx3();  
		  int result=obj.sum(20,20); //Compile Time Error 
		  System.out.println(result);
	  }

}
