package com.java.methods;

         
public class StaticMethodExample1 {
	      
	public static void main(String[] args) {
		
		fruitPrice("Apple",3);
		fruitPrice("Banana",1);
		
		memberInfo(1,"Alok","Lalmonirhat","6463792316");
		
	}	
		public static void fruitPrice(String fruitName,double p) {
			String f;
			double d;
			f=fruitName;
			d=p;
			
			System.out.println("Fruit name: "+f + ","+"Price: "+d);
		}
        public static void memberInfo(int a,String name,String city,String mobileNo) {
        	int s;
        	String n;
        	String c;
        	String m;
        	s=a;
        	n=name;
        	c=city;
        	m=mobileNo;
        	System.out.println("Serial no:"+s + " ; "  +"Name:"+n +"    ;       " +"City:"+c +" ; "+"Mobile No:"+m);
        }
	}


