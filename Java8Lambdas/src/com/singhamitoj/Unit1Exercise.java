package com.singhamitoj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1Exercise {
	

	public static void main(String rgsp[])
	{
	
		List<Person> people= Arrays.asList(
				new Person("Amitoj","Singh",27),
				new Person("Japneet","Singh",23),
				new Person("Harjot","Singh",23),
				new Person("Amandeep","Singh",26),
				new Person("Manmeet","Singh",26),
				new Person("Simarpreet","Singh",33)
				);
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
			
		});
		
		Collections.sort(people,(p1,p2)->p1.getFirstName().compareTo(p2.getFirstName()));
//		printAll(people);
		
	/*	printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				
				if(p.getFirstName().startsWith("A"))
					return true;
				return false;
			}
			
		});*/
		printConditionally(people, p1->p1.getFirstName().startsWith("A")); 
		printConditionally(people, p1->true);
		performConditionally(people, p1->true,p-> System.out.println(p));
	}
	private static void printConditionally(List<Person> people,Predicate<Person> predicate)
	{
		for(Person p:people) {
			if(predicate.test(p)) {
				System.out.println(p);
			}
		}
			
	}
	private static void performConditionally(List<Person> people,Predicate<Person> predicate,Consumer<Person> consumer)
	{
		for(Person p:people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
			
	}
	/*private static void printAll(List<Person> people) {
		for(Person  p:people) {
			System.out.println(p);
		}
			
	}
	*/
	
}

