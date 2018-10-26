package com.java.Encapsulation2;

public class CheckingBalance {
	
	private double balance = 100;
	
	public void setBalance(double newBalance) {
		double total_balance = balance+newBalance;
		this.balance = newBalance;
		
	}
	
	public double getBalance() {
		
		return balance;
	}

}
