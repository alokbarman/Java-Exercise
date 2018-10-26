package com.java.methods;
public class ReturnTypeMethodExample {

	
	public static void main(String[] args) {
		String str=name("BD Tech");
		int b=roll(2);
		
		System.out.println(str);
		System.out.println(b);
		
	}
		public static String name(String p) {
			
			String c;
			
			c="My School name is " +p;
			return c;
				
		}
		public static int roll(int c) {
			int d;
			d=c;
			return d;
		}
	}

