package com.java.OOPs.Encapsulation.Ex2;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccountNo(4332457890L);
		acc.setName("Alok");
		acc.setEmail("test@gmail.com");
		acc.setAmount(50000000f);
		
		System.out.println(acc.getAccountNo());
		System.out.println(acc.getName());
		System.out.println(acc.getEmail());
		System.out.println(acc.getAmount());

	}

}
