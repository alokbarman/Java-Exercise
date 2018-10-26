package com.java.GroupExercise;

public class LowestNumberWithArray {

	public static void main(String[] args) {
		int a[]= {100,90,80,70,60,50,40,10,20,30};
		int n=a.length;
		//System.out.println(n);
		int min=a[0];
		for(int i=0;i<n;i++) {
			//System.out.println(i);
			if(min>a[i]) {
				min=a[i];
			}
			
		}
		System.out.println(min);

	}

}
