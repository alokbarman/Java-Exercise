package com.java.practicesession;

public class FindOutLengthOfAString {

	public static void main(String[] args) {
		FindOutLengthOfAString h=new FindOutLengthOfAString();
		int len=h.length("argha");
		System.out.println(len);

	}
	public int length(String s) {
		int i=0;
		try {
			for(i=0;i>=0;i++) {
				s.charAt(i);
			}
		}catch(Exception e){
			System.out.println("The length of String=");
		}
		return i;
	}

}
