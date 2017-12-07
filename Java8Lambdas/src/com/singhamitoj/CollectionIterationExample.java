package com.singhamitoj;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
	
	public static void main(String argsp[]) {
		List<Person> people= Arrays.asList(
				new Person("Amitoj","Singh",27),
				new Person("Japneet","Singh",23),
				new Person("Harjot","Singh",23),
				new Person("Amandeep","Singh",26),
				new Person("Manmeet","Singh",26),
				new Person("Simarpreet","Singh",33)
				);
		System.out.println("Using for loop");
		for(int i=0;i<people.size();i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("Using for each loop");
		
		for(Person p:people) {
			System.out.println(p);
		}
		
		System.out.println("Using lambda foreach loop");
//		Without method reference
//		people.forEach(p -> System.out.println(p)); 
		
//		With method reference 
		people.forEach(System.out::println);
	}

}
