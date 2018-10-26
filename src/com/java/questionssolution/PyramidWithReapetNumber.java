package com.java.questionssolution;

import java.util.Scanner;

//Write a program in Java to make such a pattern like a pyramid with a number which will
//repeat the number in the same row.

public class PyramidWithReapetNumber {

	public static void main(String[] args) {
		int i, j, n, s, x;
		System.out.print("Input number of rows : ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		in.close();

		s = n + 4 - 1;
		for (i = 1; i <= n; i++) {
			for (x = s; x != 0; x--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
			s--;
		}
	}

}
