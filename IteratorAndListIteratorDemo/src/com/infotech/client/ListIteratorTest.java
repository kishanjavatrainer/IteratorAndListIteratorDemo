package com.infotech.client;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.infotech.model.Employee;

public class ListIteratorTest {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1001, "Martin", 90000.00, "martin.s@infotech.com"));
		empList.add(new Employee(1002, "Sean", 95000.00, "sean.m@infotech.com"));
		empList.add(new Employee(1003, "Joya", 30000.00, "joya.s@infotech.com"));
		empList.add(new Employee(1004, "Harman", 50000.00, "harman.s@infotech.com"));
		empList.add(new Employee(1005, "Sam", 40000.00, "sam.s@infotech.com"));
	
		//iterateListUsingListIterator(empList);
		//addElementsInListUsingListIterator(empList);
		//deleteElementsInListUsingListIterator(empList);
		replaceElementsInListUsingListIterator(empList);
	}

	private static void iterateListUsingListIterator(List<Employee> empList) {
		
		ListIterator<Employee> listIterator = empList.listIterator();
		System.out.println("Forward direction::::");
		while (listIterator.hasNext()) {
			Employee employee = listIterator.next();
			System.out.println(employee);
			
		}
		System.out.println("Backward direction::::");
		while (listIterator.hasPrevious()) {
			Employee employee = (Employee) listIterator.previous();
			System.out.println(employee);
		}
	}

	private static void addElementsInListUsingListIterator(List<Employee> empList) {
		ListIterator<Employee> listIterator = empList.listIterator();
		while (listIterator.hasNext()) {
			Employee employee = listIterator.next();
			if(!employee.getName().equalsIgnoreCase("KK")) {
				listIterator.add(new Employee(9999, "KK", 90000.00, "kk@infotech.com"));
				break;
			}
		}
		for (Employee employee : empList) {
			System.out.println(employee);
		}
	}

	private static void deleteElementsInListUsingListIterator(List<Employee> empList) {

		ListIterator<Employee> listIterator = empList.listIterator();
		while (listIterator.hasNext()) {
			Employee employee = listIterator.next();
			if(employee.getName().equalsIgnoreCase("Joya")) {
				listIterator.remove();
			}
		}
		for (Employee employee : empList) {
			System.out.println(employee);
		}
	
	}

	private static void replaceElementsInListUsingListIterator(List<Employee> empList) {


		ListIterator<Employee> listIterator = empList.listIterator();
		while (listIterator.hasNext()) {
			Employee employee = listIterator.next();
			if(employee.getName().equalsIgnoreCase("Joya")) {
				employee.setName("Joya Bingel");
				listIterator.set(employee);
			}
		}
		for (Employee employee : empList) {
			System.out.println(employee);
		}
	
	
	}

}
