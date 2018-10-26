package com.java.interfaces;

public class BankInterest implements Bank{

	public static void main(String[] args) {
		BankInterest obj=new BankInterest();
		obj.chase();
		obj.city();
		obj.td();
	}

	@Override
	public void chase() {
		int rate=8;
		System.out.println("Interset rate="+rate+"%");	
	}

	@Override
	public void city() {
		int rate=7;
		System.out.println("Interset rate="+rate+"%");	
	}

	@Override
	public void td() {
		int rate=9;
		System.out.println("Interset rate="+rate+"%");	
	}

}
