package com.java.practicesession;

public class Summation {
	//the sum from 1 to n (1 + 2 + …+ n) where n is a variable

	public static void main(String[] args) {
		
		int n = 100;
        int sum = 0;
 
        for (int i = 0; i <= n; i++) {
              sum = sum + i;
              
        }
        System.out.println(sum);

	}

}
