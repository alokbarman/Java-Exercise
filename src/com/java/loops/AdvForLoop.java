package com.java.loops;

public class AdvForLoop {

	public static void main(String[] args) {
		int[] test=new int[4];
		test[0]=40;
		test[1]=55;
		test[2]=63;
		test[3]=17;
		
		for(int i:test) {
			if(i==20) {
				continue;
			}
			System.out.println(i);
			
			if(i==63) {
				break;	
			}
			System.out.println(i);
		}
	}
}
