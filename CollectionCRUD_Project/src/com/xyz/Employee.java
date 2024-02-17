package com.xyz;

public class Employee {
	private int EmpId;
	private String EmpName;
	private String EmpCity;
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpCity() {
		return EmpCity;
	}
	public void setEmpCity(String empCity) {
		EmpCity = empCity;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empId, String empName, String empCity) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpCity = empCity;
	}
	
	@Override
	public String toString() {
		return EmpId +" "+ EmpName +" "+ EmpCity;
	}
}