package com.java.inheritance.person;

class Employee extends Person {
	
	private String empCode;
	
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode=empCode;
	}
	public static void main(String[] args) {// only private cannot accessed
		Employee obj = new Employee();
		obj.sub();
		obj.div();
		obj.multiplication();
	}

}
