package com.java.inheritance.vehicle;

public class TestVehicle {

	public static void main(String[] args) {
		BMW b=new BMW();
		b.start(); //BMW-----start
		b.theftSafety(); //BMW-----theftSafety
		b.stop(); //Car---stop
		b.refuel();//Car---refuel
		b.engine();//Vehicle----engine

	}

}
