package com.java.inheritance.vehicle2;
public class TestDemo {

	public static void main(String[] args) {
		Vehicle vh=new MotorBike();
		vh.move();
		vh=new Vehicle();
		vh.move();
		vh=new Toyota();
		vh.move();
		vh=new Honda();
		vh.move();

	}

}
