package com.java.OOPs.Polymorphism;

public class MainMethodOverLoading {

	public static void main(String[] args){
	System.out.println("Execution starts from Main()");
	
	MainMethodOverLoading obj = new MainMethodOverLoading();
	obj.main(0);
	obj.main(0, 0);
	}
	
	void main(int args){
	System.out.println("Overload main()");
	}
	
	double main(int i, double d){
	System.out.println("Override main()");
	return d;
	}

}
