package com.java.practicesession;

public class SwapStringWithoutThirdVariables {

	public static void main(String[] args) {
		String a="var1";
		String b="var2";
		a=a+b;
		b=a.substring(0, (a.length()-(b.length())));
		
		a=a.substring(b.length(), (a.length()));
		System.out.println("a="+a+",");
		System.out.println("b="+b);
	}

}
