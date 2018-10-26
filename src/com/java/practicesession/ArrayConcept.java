package com.java.practicesession;

public class ArrayConcept {

	public static void main(String[] args) {
		//1.int array
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]);
		System.out.println(i.length);
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		//2.double array
		double d[]=new double[3];
		d[0]=11.11;
		d[1]=22.22;
		d[2]=33.33;
		System.out.println(d[0]);
		//3.char array
		char c[]=new char[3];
		c[0]='a';
		c[1]='2';
		c[2]='$';
		System.out.println(c[1]);
		//4.boolean array
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		//5.String array
		String s[]=new String[3];
		s[0]="test";
		s[1]="hello";
		s[2]="world";
		System.out.println(s.length);
		System.out.println(s[2]);

	}

}
