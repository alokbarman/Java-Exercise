package com.java.inheritance.vehicle3;

public class TestDemo {

	public static void main(String[] args) {
		Vehicle vh=new MotorBike();
		vh.move();
		
		vh=new Vehicle();
		vh.move();
		vh= new Truck();
		vh.move();

	}

}
