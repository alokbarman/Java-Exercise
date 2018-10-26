package com.java.practicesession;

public class PrintNumberInWordByLoop {
	/*Write a program called PrintNumberInWord which prints "ONE", "TWO",…... , "NINE", "OTHER" if the int
	 *  variable "number" is 1, 2,…... , 9, or other, respectively.*/

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			//System.out.println(i);
			if(i==1) {
				System.out.println(i+" =ONE");
			}
			else if(i==2) {
				System.out.println(i+" =TWO");
			}
			else if(i==3) {
				System.out.println(i+" =THREE");
			}
			else if(i==4) {
				System.out.println(i+" =FOUR");
			}
			else if(i==5) {
				System.out.println(i+" =FIVE");
			}
			else if(i==6) {
				System.out.println(i+" =SIX");
			}
			else if(i==7) {
				System.out.println(i+" =SEVEN");
			}
			else if(i==8) {
				System.out.println(i+" =EIGHT");
			}
			else if(i==9) {
				System.out.println(i+" =NINE");
			}
			else if(i==10) {
				System.out.println(i+"=TEN");
			}
			else {
				System.out.println(i+"=OTHER");
			}	
		}

	}

}
