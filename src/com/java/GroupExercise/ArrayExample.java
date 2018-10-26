package com.java.GroupExercise;

public class ArrayExample {

	public static void main(String[] args) {
		
		int a[]=new int[10];
		a[0]=10; // index zero
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		a[6]=70;
		a[7]=80;
		a[8]=90;
		a[9]=100;
		
		int num=a.length;
		System.out.println(num);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);*/

	}

}
