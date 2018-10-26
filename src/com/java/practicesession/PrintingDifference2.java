package com.java.practicesession;

public class PrintingDifference2 {

	public static void main(String[] args) {
		String a = "hcl technology";
		a=a.concat("b");
		final String b = "hcl technology";
		//b=b.concat("a");
        //give compile time error,reassignment not possible.

	}

}
