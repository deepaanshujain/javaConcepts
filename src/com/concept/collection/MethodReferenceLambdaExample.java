package com.concept.collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceLambdaExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Allen", 19), new Person("Bob", 20));

		performConditionally(people, p -> true, System.out::println); // Method Reference
		performConditionally(people, p -> true, (p) -> System.out.println(p)); // Normal Lambda

		Thread t = new Thread(() -> printMessage()); // Normal Lambda Syntax
		t.start();

		Thread t1 = new Thread(MethodReferenceLambdaExample::printMessage); // Method Reference
		t.start();s
	}

	private static void printMessage() {
		System.out.println("This is a new Thread");
	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}

	}

}

class Person {

	public String name;
	public int age;

	public Person(String name, int age) {
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
