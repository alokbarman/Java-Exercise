package com.java.loops;

public class LoopDemo {

	public static void main(String[] args) {
		for(int i=5;i<=100;i=i+5) {
			//System.out.println("Value if i: "+i);
		}
     for(int a=110;a>=0;a=a-3) {
    	 //System.out.println(a);
     }
     
     /*int a=1;
     int b=200;
     while(a<b) {
    	 System.out.println(a);
    	 a++;
     }*/
     int x=10;
     int a=2;
     int b=3;
     
     do {
    	 System.out.println(x);
    	 x=x+a+b;
    	 System.out.println("\n"+x);
     }while(x<2);
	}

}
