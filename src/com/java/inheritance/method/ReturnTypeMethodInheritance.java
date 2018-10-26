package com.java.inheritance.method;

public class ReturnTypeMethodInheritance {

	public static void main(String[] args) {
		
		/*Examples obj=new Examples();
		int q= obj.addition();
		int r= obj.subtraction();*/
		int q=addition();
		int r=subtraction();
		
		System.out.println(q+r);
	}
    static int addition() {
    	int a=5;
    	int b=2;
    	int c=a+b;
    	return c;
    }
    static int subtraction() {
    	int m=10;
    	int n=8;
    	int p=m-n;
    	return p;	
    }
}
