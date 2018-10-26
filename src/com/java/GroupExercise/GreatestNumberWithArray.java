package com.java.GroupExercise;

public class GreatestNumberWithArray {

	public static void main(String[] args) {
		
		int a[]= {25,77,96,125,2,145};
        int n=a.length;
        
       
        int max = a[0];
          //System.out.println(max);
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
            	//System.out.println(a[i]);
                max = a[i];
            }
        }
        System.out.println("Maximum value:"+max);

	}

}
