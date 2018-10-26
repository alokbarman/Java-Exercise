package com.java.methods;

public class ReturnTypeMethodExample5{
    public static void main(String[] args) {
	
	int i= age(42);
	int i1= age(5);
	String str= family("Tapas");
	
	
	System.out.println(i);
	System.out.println(i1);
	System.out.println(str);
	

}

    public static int age(int p) {

	int c;
	c = p;
	return c;	
}
    public static String family(String name) {
	String d;
	d=name;
	return d;
    }	
}


