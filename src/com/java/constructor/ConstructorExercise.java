package com.java.constructor;

public class ConstructorExercise {
	int h;
	int w;
	int d;
	
	public ConstructorExercise() {
		h=20;
		w=22;
		d=25;
		
	   	}
    void boxVolume() {
    	int v=h*w*d;
        System.out.println(v);
    }
}
