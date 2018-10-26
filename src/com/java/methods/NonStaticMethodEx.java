package com.java.methods;

public class NonStaticMethodEx {
	void sum(int a,int b) {
		System.out.println(a+b);
	}
	void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		NonStaticMethodEx obj=new NonStaticMethodEx();
		obj.sum(10, 10);
		obj.sum(10,10,10);

	}

}
