package com.java.Encapsulation;

public class EncaptulationExample {
	private int ssn;
	private String empName;
	private int empAge;
	
	public void setEmpSSN(int ssn) {
		this.ssn=ssn;
	}
	
	public int getEmpSSN() {
		return ssn;
	}
	public void setEmpName(String name) {
		this.empName =name;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpAge(int age) {
		empAge=age;
	}
	public int getEmpAge() {
		return empAge;
	}

}
