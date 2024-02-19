package com.xyz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeCRUD {

	public static void main(String[] args) {
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		
		int choice;
		
		List<Employee> l = new ArrayList<Employee>();
		
		do{
			System.out.println("1.Create");
			System.out.println("2.Read");
			System.out.println("3.Update");
			System.out.println("4.delete");
			System.out.print("Please neter your choice here(1,2,3,4): ");
			choice = scInt.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.print("Please enter the employee's ID: ");
				int id = scInt.nextInt();
				System.out.print("Please enter the employee's Name: ");
				String name = scString.nextLine();
				System.out.print("Please enter the employee's Skills: ");
				String skills = scString.nextLine();
				System.out.print("Please enter the employee's Age: ");
				int age = scInt.nextInt();
				System.out.print("Please enter the employee's Salary: ");
				int salary = scInt.nextInt();
				System.out.print("Please enter the employee's Joining Date: ");
				String JD = scString.nextLine();
				
				l.add(new Employee(id,name,skills,age,salary,JD));
				Collections.sort(l);
			break;
				
			case 2:
				Iterator<Employee> it = l.iterator();
				while(it.hasNext()) {
					Employee e = it.next();
					System.out.println(e);
				}
//				System.out.println(l);
			break;
			
			case 3:
				System.out.print("Please enter the employee's id to update: ");
				id = scInt.nextInt();
				Boolean found = false;
				it = l.iterator();
				while(it.hasNext()) {
					Employee e = it.next();
					if(e.getEmployeeID()==id) {
						System.out.print("Please enter Employee's name(update): ");
						name = scString.nextLine();
						
						System.out.print("Please enter the employee's skills(update): ");
						skills = scString.nextLine();
						System.out.print("Please enter the employee's age(update): ");
						age = scInt.nextInt();
						System.out.print("Please enter the employee's salary: ");
						salary = scInt.nextInt();
						System.out.print("Please enter the employee's joining date: ");
						JD = scString.nextLine();
						
						l.set(id-1, new Employee(id,name,skills,age,salary,JD));
						found = true;
					}
				}
				if(!found) {
					System.out.println("Not found");
				}
				else {
					System.out.println("Successfully updated...");
				}
			break;
			
			case 4:
				found = false;
				System.out.print("Please neter the employee's id: ");
				id = scInt.nextInt();
				it = l.iterator();
				while(it.hasNext()) {
					Employee e = it.next();
					if(e.getEmployeeID()==id) {
						it.remove();
					}
					found=true;
				}
				if(!found) {
					System.out.println("Not found");
				}
				else {
					System.out.println("Successfully deleted...");
				}
			break;
			}
		}
		while(choice>0);
	}
}
