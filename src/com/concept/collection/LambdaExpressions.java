package com.concept.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class LambdaExpressions {

	public static void main(String args[]) {
		new Thread(new ThreadCode()).start();		//	Without Lambda
		
		// Without Lambda
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Runnable 2 without Lambda");
				
			}
		}).start();
		
		
		// With Lambda that only works with interfaces only one method to override
		new Thread(()->System.out.println("Inside Runnable 3 with Lambda")).start();
		
		
		Employee deepanshu = new Employee("Deepanshu", 29);
		Employee john	= new Employee("John", 25);
		Employee jack = new Employee("Jack", 27);
		Employee arnold = new Employee("Arnold", 21);
		
		
		List<Employee> employees = new ArrayList<>();
		employees.add(deepanshu);
		employees.add(john);
		employees.add(jack);
		employees.add(arnold);
		
		/* Without Lambda Code Starts */
//		Collections.sort(employees, new Comparator<Employee>() {
//			@Override
//			public int compare(Employee employee1, Employee employee2) {
//				return employee1.getName().compareTo(employee2.getName());
//				
//			}
//		});
		/* Without Lambda Code Ends */
		
//		for(Employee employee: employees) {
//			System.out.println(employee.getName());
//		}
		
		/* With Lambda Code Version 1 Starts */
//		Collections.sort(employees, (Employee employee1, Employee employee2) 
//				-> employee1.getName().compareTo(employee2.getName()));
		/* With Lambda Code Version 1 Ends */
		
		/* With Lambda Code Version 1 Starts */
		Collections.sort(employees, ( employee1,  employee2) 
				-> employee1.getName().compareTo(employee2.getName()));
		/* With Lambda Code Version 1 Ends */
		
		for(Employee employee: employees) {
			System.out.println(employee.getName());
		}
		
		
		/* Without Lambda Starts */
		String concatString = stringManipulation(new UpperConcat() {
			
			@Override
			public String upperConcat(String s1, String s2) {
				// TODO Auto-generated method stub
				return s1.toUpperCase() + " " + s2.toUpperCase();
			}
		}, employees.get(0).getName(), employees.get(1).getName());
		
		System.out.println(concatString);
		
		/* Without Lambda Ends */
		
		/* With Lambda Starts */
		UpperConcat uc = (s1, s2)-> s1.toUpperCase() + " " + s2.toUpperCase(); 
		String concatStringLambda = stringManipulation(uc, employees.get(0).getName(), employees.get(1).getName());
		System.out.println(concatStringLambda);	
		/* With Lambda Ends */
		
		
	}
	
	
	public static String stringManipulation(UpperConcat uc, String s1, String s2) {
		return uc.upperConcat(s1, s2);
	}
}


class ThreadCode implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside Runnable Without Lambda");
		
	}
	
}


class Employee {
	private String name;
	private Integer age;
	
	public Employee(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}	
}


interface UpperConcat{
	public String upperConcat(String s1, String s2);
}

