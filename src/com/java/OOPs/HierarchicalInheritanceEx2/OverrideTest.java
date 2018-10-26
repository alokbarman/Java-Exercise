package com.java.OOPs.HierarchicalInheritanceEx2;

public class OverrideTest {

	public static void main(String[] args) {
		A a1=new B();
		a1.f1(); // this is f1() method from B Class
		a1.f4(); // this is f4() method from A
		A c1=new C();
		c1.f1(); // this is f1() method from Class C
		c1.f4();
		B b1 = new B();
		b1.f1(); //this is f1() method from B Class
		b1.f4();
		C c = new C();
		c.f1(); // this is f1() method from Class C
		c.f4();
		A a = new A();
		a.f1(); // This f1() method from A
		a.f4();

	}

}
