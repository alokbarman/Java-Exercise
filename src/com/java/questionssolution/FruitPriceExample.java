package com.java.questionssolution;

public class FruitPriceExample {
	int applePrice=2;
	String fruit1="Apple";
	double orangePrice=1.8d;
	String fruit2="Orange";
	float mangoPrice=1.6f;
	String fruit3="Mango";

	public static void main(String[] args) {
		FruitPriceExample obj=new FruitPriceExample();
		System.out.println("Fruit name: "+obj.fruit1+","+"Price= "+obj.applePrice+"$");
		System.out.println("Fruit name: "+obj.fruit2+","+"Price= "+obj.orangePrice+"$");
		System.out.println("Fruit name: "+obj.fruit3+","+"Price= "+obj.mangoPrice+"$");

	}

}
