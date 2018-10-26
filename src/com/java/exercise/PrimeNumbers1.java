package com.java.exercise;

public class PrimeNumbers1 {

	public static void main(String[] args) {
		    int a=1;
			int b=100;
			System.out.println("Prime numbers between"+ a+ "and" + b);
			
			for(int x=1;x<100;x++) {
				
				boolean prime=true;
					
				for(int y=2;y<x;y++) {
					
					if(x%y==0) {
						
						prime=false;
						//break;
					}
				}
				if(prime)
					System.out.print(x+",");
			}

		}

	}


