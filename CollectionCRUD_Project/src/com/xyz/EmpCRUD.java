package com.xyz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class EmpCRUD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		int choice;
		List<Employee> l = new ArrayList<Employee>();
		do {
			System.out.println("1.Create");
			System.out.println("2.Read");
			System.out.println("3.update");
			System.out.println("4.Delete");
			System.out.println("5.Search employee by Id");
			System.out.print("Enter you choice(1,2,3,4,5): ");
			choice = sc.nextInt();
			System.out.println();
			
			switch(choice) {
			case 1: 
				System.out.print("Enter the employee Id: ");
				int id = sc.nextInt();
				System.out.print("Enter the employee Name: ");
				String name = sc1.nextLine();
				System.out.print("Enter the employee city: ");
				String city = sc1.nextLine();
				l.add(new Employee(id,name,city));
				System.out.println("=====================================================");
			break;
			
			case 2:
				System.out.println("Your data: ");
				Iterator<Employee> it = l.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				System.out.println("=====================================================");
			break;
			
			case 3: 
				System.out.print("Enter the employee number to update: ");
				id = sc.nextInt();
				boolean b = false;
				ListIterator<Employee> li = l.listIterator();
				while(li.hasNext()) {
					Employee e = li.next();
					if(e.getEmpId()==id) {
						System.out.print("Enter new name: ");
						name = sc1.nextLine();
						
						System.out.println("Enter new city: ");
						city = sc1.nextLine();
						
						li.set(new Employee(id,name,city));
						b = true;
					}
				}
				if(!b) {
					System.out.println("Not found");
				}
				else {
					System.out.println("Successfully updated");
				}
			break;
			
			case 4: 
				System.out.print("Enter the employee number to delete: ");
				id = sc.nextInt();
				boolean deleteResult=false;
				it = l.iterator();
				while(it.hasNext()) {
					Employee e = it.next();
					if(e.getEmpId()==id) {
						it.remove();
						deleteResult=true;
					}
				}
				if(!deleteResult) {
					System.out.println("Not found");
				}
				else {
					System.out.println("Successfully deleted..!");
				}
				System.out.println("=====================================================");
			break;
			
			case 5: 
				System.out.print("Enter the employee number to search: ");
				id = sc.nextInt();
				boolean searchResult=false;
				it = l.iterator();
				while(it.hasNext()) {
					Employee e = it.next();
					if(e.getEmpId()==id) {
						System.out.println(e);
						searchResult=true;
					}
				}
				if(!searchResult) {
					System.out.println("Not found");
				}
				System.out.println("=====================================================");
			break;
			}
		}
		while(choice>=0);
		
	}
}
