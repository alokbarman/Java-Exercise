package com.java.conditionalstatment;

public class ConditionalStatement2 {

	public static void main(String[] args) {
		//boolean voteAge=false;
		int voterAge=18;
		int myAge=16;
		boolean citizen=true;
		if(myAge>=voterAge && citizen) {
			System.out.println("I am a Voter");
		}
		else if(citizen) {
			System.out.println("I am voter also");
		}
		else {
			System.out.println("I am teen");
		}

	}

}
