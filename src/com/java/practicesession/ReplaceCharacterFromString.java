package com.java.practicesession;

public class ReplaceCharacterFromString {
	//Write a program to replace particular character with another character  from the given string 
	//without using Java API's.
	
	public static void main(String[] args) {
		String a="Software";
		String[]a1=a.split("");
		String ch="";
		for(int i=0;i<a1.length;i++) {
			if(a1[i].equals("w")) {
				ch=ch+"G";
			}
			else {
				ch=ch+a1[i];
			}
		}
		System.out.println(ch);

	}

}
