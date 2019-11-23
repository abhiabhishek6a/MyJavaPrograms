package com.trainingbasket.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Employee {
	static int tempId = 0;
	String name;
	int id;

	public Employee(String name) {
		super();
		this.name = name;
		this.id = ++tempId;
	}

	@Override
	public int hashCode() {
		return this.id * 101;
	}

	@Override
	public String toString() {
		return "Id : " + this.id + "Name :" + this.name + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		if (this.id == emp.id && (emp.name.equals(this.name))) {
			return true;
		}
		return false;
	}
}

public class CollectImpl {

	public static void main(String[] args)
	{
		List<Employee> empList = new ArrayList<Employee>(10);
//		System.out.println(empList.s
		empList.add(new Employee("Ramesh"));
		empList.add(new Employee("Dinesh"));
		empList.add(new Employee("Suresh"));
		Employee emp = new Employee("Ramesh");
		emp.id = 1;
		empList.add(emp);
		empList.add(new Employee("Rohit"));

		Set<Employee> empSet = new HashSet<Employee>();
		for (Employee employee : empList)
		{
			empSet.add(employee);
		}
		System.out.println("empList :");
		empList.forEach(System.out::print);
		System.out.println("empSet :");
		empSet.forEach(System.out::print);

		// Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
	}
}