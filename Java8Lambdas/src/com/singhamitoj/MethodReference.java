package com.singhamitoj;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReference {
	
	public static void main(String args[]) {
//	Without method reference 
		Thread t=new Thread( () -> printMessage());
		t.start();
//		With method reference calling static method 
		Thread t2=new Thread( MethodReference::printMessage);
		t2.start();
		
		
		List<Person> people= Arrays.asList(
				new Person("Amitoj","Singh",27),
				new Person("Japneet","Singh",23),
				new Person("Harjot","Singh",23),
				new Person("Amandeep","Singh",26),
				new Person("Manmeet","Singh",26),
				new Person("Simarpreet","Singh",33)
				);
		
//		Alternative of this  performConditionally(people, p1->true,p-> System.out.println(p));
		performConditionally(people, p1->true,System.out::println);
		
		
	}

	public static void printMessage() {
		System.out.println("Hello");
	}
	
	private static void performConditionally(List<Person> people,Predicate<Person> predicate,Consumer<Person> consumer)
	{
		for(Person p:people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
			
	}
}
