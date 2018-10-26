package com.java.OOPs.MultilevelInheritanceEx2;

public class GrandChild extends Child{
	
	float own_money = 5000;

	public static void main(String[] args) {
		GrandChild obj = new GrandChild();
		float total_money = obj.grant_parent_money+obj.parent_money+obj.child_money+obj.own_money;
		System.out.println(total_money);

	}

}
