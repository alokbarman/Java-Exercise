package com.java.practicesession;

public class SummationOfString {
	//String s1="12 3 4 some text 3";
	public static void main(String[] args) {
		String a="12 a c 3 4 some text 3 x y 5";
		String[] s1=a.split(" ");
        int sum=0;
        for(int i=0;i<s1.length;i++){
              if(s1[i].matches("[0-9]+")){
                        sum=sum+Integer.parseInt(s1[i]);
              }
         }
        System.out.println(sum);

	}
	
}
