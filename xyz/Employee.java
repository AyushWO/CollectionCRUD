package com.xyz;

public class Employee implements Comparable<Employee> {
	private int EmployeeID;
	private String Name;
	private String skills;
	private int age;
	private int salary;
	private String JoiningDate;

	@Override
	public int compareTo(Employee ob) {
		return this.age - ob.age;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getJoiningDate() {
		return JoiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		JoiningDate = joiningDate;
	}

	public Employee(int employeeID, String name, String skills, int age, int salary, String joiningDate) {
		super();
		EmployeeID = employeeID;
		Name = name;
		this.skills = skills;
		this.age = age;
		this.salary = salary;
		JoiningDate = joiningDate;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [EmployeeID=" + EmployeeID + ", Name=" + Name + ", skills=" + skills + ", age=" + age
				+ ", salary=" + salary + ", JoiningDate=" + JoiningDate + "]";
	}
}