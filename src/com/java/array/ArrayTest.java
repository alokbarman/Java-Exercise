package com.java.array;

public class ArrayTest {

	public static void main(String[] args) {
		int[]b;
		int[]a;
		a=new int[8];
		a[0]=40;
		a[1]=55;
		a[2]=63;
		a[3]=17;
		a[4]=22;
		a[5]=68;
		a[6]=89;
		a[7]=97;
		
		for(int i=0;i<a.length;i++) {
			//System.out.println("Value of a"+i+"="+a[i]);
		}
		
		b= new int[] {2,44,33,23,22,66};
		int c=0;
		for(int i=0;i<b.length;i++) {
			System.out.println("Value of b="+b[i]);
			c=c+b[i];
			
		}
		//System.out.println("Value of c="+c);
	}
	
}
