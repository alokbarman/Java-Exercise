package com.java.OOPs.Encapsulation.Ex3;

public class Employee {
	private int ssn;
	private String empName;
	private double empSalary;
	public int getEmpSsn() {
		return ssn;
	}
	public String getEmpName() {
		return empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSsn(int newValue) {
		ssn = newValue;
	}
	public void setEmpName(String newValue) {
		empName = newValue;
	}
	public void setEmpSalary(double newValue) {
		empSalary = newValue;
	}

}
