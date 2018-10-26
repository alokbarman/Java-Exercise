package com.java.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {

	public static void main(String[] args) {
		
		List<String> obj = new ArrayList<String>();
		obj.add("Alok");
		obj.add("shohag");
		obj.add("Abdul");
		obj.add("Shourav");
		obj.add("Hassan");
		//obj.remove("Alok");
		int a=obj.size();
		for(int i=0;i<obj.size();i++) {
			System.out.println(a);
		}
		
		System.out.println(a);
		for(String t:obj) {
			System.out.println(t);
		}
		

	}

}
