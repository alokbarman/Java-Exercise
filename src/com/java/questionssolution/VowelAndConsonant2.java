package com.java.questionssolution;

import java.util.Scanner;

public class VowelAndConsonant2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a letter : ");
        String letter = in.next();
        char let = Character.toLowerCase(letter.charAt(0));
        in.close();
        if (!Character.isLetter(let))
            System.out.println(letter + " is invalid input.");
        else
        {
            switch(let)
            {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    System.out.println(letter + " is a vowel");
                    break;
                default:
                    System.out.println(letter + " is a consonant");
            }    
        }

	}

}
