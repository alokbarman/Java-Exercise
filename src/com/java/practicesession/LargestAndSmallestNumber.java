package com.java.practicesession;

import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		int numbers[]= {25,77,96,125,2};
		int largest=numbers[0];
		int smallest=numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>=largest) {
				largest=numbers[i];
			}
			else if(numbers[i]<=smallest) {
				smallest=numbers[i];
			}
		}
		System.out.println("Given numbers are="+ Arrays.toString(numbers));
		System.out.println("Largest number ="+ largest);
		System.out.println("Smallest number ="+ smallest);

	}

}
