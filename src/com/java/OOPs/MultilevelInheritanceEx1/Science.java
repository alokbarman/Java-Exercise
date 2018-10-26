package com.java.OOPs.MultilevelInheritanceEx1;

public class Science extends DA{
	
	float bonous = 1500;

	public static void main(String[] args) {
		Science obj = new Science();
		
		obj.total_sal = obj.salary+obj.hra+obj.da+obj.bonous;
		System.out.println("Total salary = "+ obj.total_sal);
				
	}

}
