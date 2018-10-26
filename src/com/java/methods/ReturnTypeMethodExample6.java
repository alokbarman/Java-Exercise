package com.java.methods;

public class ReturnTypeMethodExample6 {
		int a=30;
		int b=40;
		int c=50;
	     
		public static void main(String[] args) {
			
			ReturnTypeMethodExample6 obj = new ReturnTypeMethodExample6();
			System.out.println("value of 1st method: "+obj.addition());
			System.out.println("value of 2nd method: "+obj.addition1());
			System.out.println("value of 3rd method: "+obj.addition2());
			//int m=addition();
			//int n=addition1();
			//int p=addition2();	
		}
	    public int addition() {
	    	int d;
	    	d = a;
	    	int h = a+d;
	    	return h;
	    }
	    public int addition1() {
	    	int f;
	    	f=b;
	    	int i=b+f;
	    	return i;
	    }
	    public int  addition2() {
	    	int g;
	    	g=c;
	    	int j=c+g;
	    	return j;
	    }

	}

