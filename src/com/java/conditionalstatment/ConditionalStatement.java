package com.java.conditionalstatment;

public class ConditionalStatement {

	public static void main(String[] args) {
		Boolean voteage = false;
		int voterAge = 18;
		int myAge = 15;
		int yourAge = 16;
		Boolean citizen = true;
		if (myAge >= voterAge && citizen) {
			System.out.println("I am a voter");
		}
		else if(citizen) {
			System.out.println("I am a voter too");
		}
		//else if() {
			
		//}
		
		else {
			System.out.println("I am too young");
	}

}
}