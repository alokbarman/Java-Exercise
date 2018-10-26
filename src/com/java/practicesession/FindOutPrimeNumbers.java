package com.java.practicesession;

public class FindOutPrimeNumbers {

	public static void main(String[] args) {

		int limit = 100;
		System.out.println("Prime Numbers Between 1 and "+limit+":");
		
		for (int i = 1; i < limit; i++) {
			boolean isPrime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.print(i + ",");
			}

		}
	}

}
