package com.java.interfaces;

public class InterfaceTest implements Animal, Testing {
	
	public static void main(String[]args) {
		InterfaceTest tst=new InterfaceTest();
		tst.eat();
		tst.travel();
		tst.noOffeet();
		tst.getcash();
	}
	public void eat() {
		String feed="Animal drinking milk";
		System.out.println(feed);
	}
	public void travel() {
		int dis=10;
		String move="By Walking";
		System.out.println("Animal travelled"+dis+move);
	}
	public void noOffeet() {
		int foot=4;
		System.out.println("Animal has"+foot+"Legs");
	}
	public void getcash() {
		
	}
	@Override
	public void tarvel() {
		// TODO Auto-generated method stub
		
	}
	
		
}
