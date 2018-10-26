package com.java.Encapsulation;

public class EncapsulationEg {
	private String str;
	private String num;
	private int roll;
	
	public int getRoll() {
		return roll;
	}
	public String getCode() {
		return str;
	}
	public String getVal() {
		return num;
	}
	
	public void setRoll(int regn) {
		roll=regn;
	}public void setCode(String codeName) {
		str=codeName;
	}
	public void setVal(String id) {
		num=id;
	}

}
