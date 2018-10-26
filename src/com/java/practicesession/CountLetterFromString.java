package com.java.practicesession;

public class CountLetterFromString {

	public static void main(String[] args) {
		CountLetterFromString.countLetter("NrityamBarmanArgha");
		countLetter("barman");
		countLetter(null);
		countLetter("null");

	}
	public static void countLetter(String s) {
		if(s==null) {
			return;
		}
		int counter=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i))) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
