package com.singhamitoj;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {

	public static void main(String args[]) {
		
		
		List<Person> people= Arrays.asList(
				new Person("Amitoj","Singh",27),
				new Person("Japneet","Singh",23),
				new Person("Harjot","Singh",23),
				new Person("Amandeep","Singh",26),
				new Person("Manmeet","Singh",26),
				new Person("Simarpreet","Singh",33)
				);
		
		people.stream()
		.filter(p -> p.getFirstName().startsWith("A"))
		.forEach(System.out::println);
		
		
		System.out.println(people.stream()
		.filter(p ->p.getFirstName().endsWith("t"))
		.count());
	}
}
