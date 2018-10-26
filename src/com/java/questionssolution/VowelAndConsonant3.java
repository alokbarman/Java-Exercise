package com.java.questionssolution;

import java.util.Scanner;

public class VowelAndConsonant3 {

	public static void main(String[] args) {
		// declare variables
		String inputLetter = "";
		// welcome the user
		System.out.println("I can tell you if a letter in the alphabet is a vowel or a consonant.");
		// get ready to read the user data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for a letter
		System.out.print("Please enter a letter from English alphabet: ");
		// store the user input
		inputLetter = keyboard.next();
		keyboard.close();

		// trim it to remove white space
		inputLetter = inputLetter.trim();

		// check the length
		if (inputLetter.length() == 1) {
			// convert inputLetter to lowercase
			inputLetter = inputLetter.toLowerCase();
			// is inputLetter between a and z and not a number or other char
			if (inputLetter.compareTo("a") >= 0) {
				if (inputLetter.equals("a") || inputLetter.equals("e") || inputLetter.equals("i")
						|| inputLetter.equals("o") || inputLetter.equals("u")) {
					System.out.println(inputLetter + " is a VOWEL.");
				} else {
					System.out.println(inputLetter + " is a CONSONANT.");
				} // output decision END

			} else {
				System.out.println(inputLetter + " is not valid. You might have entered somthing other then a to z. ");
			} // if between a and z END
		} else {
			System.out.println(inputLetter + " is not valid. You either entered more then one letter. ");
		} // if length END

	}

}
