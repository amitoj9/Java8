package com.singhamitoj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
//		Using stream filer
		people.stream()
		.filter(p -> p.getFirstName().startsWith("A"))
		.forEach(System.out::println);
		
		
		System.out.println(people.stream()
		.filter(p ->p.getFirstName().endsWith("t"))
		.count());
		
		Stream<Person> names= Stream.of(new Person("Amitoj","Singh",27),
				new Person("Japneet","Singh",23),
				new Person("Harjot","Singh",23),
				new Person("Amandeep","Singh",26),
				new Person("Manmeet","Singh",26),
				new Person("Simarpreet","Singh",33));
		
		List<Person> reverseSorted= names.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(reverseSorted);

		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<100;i++)
		list.add(i);
		
		System.out.println(sumStream(list));
//		Converting Stream to Collection
		Stream<Integer> ss= Stream.of(1,2,3,4);
		List<Integer> streamList=ss.collect(Collectors.toList());
		System.out.println(streamList);
		
//		Creating re usable stream
		Supplier<Stream<Integer>> reuseStream=() ->Stream.of(1,2,3,4,5,6);
		
		Integer[] streamArry= reuseStream.get().toArray((Integer[]::new));
		System.out.println(Arrays.toString(streamArry));
		
		List<Integer> ist=reuseStream.get().collect(Collectors.toList());
		System.out.println(ist);
		
		

	}
	
	private static int sumStream( List<Integer> list) {
		return list.stream().filter(i -> i>10).mapToInt(i ->i).sum();
	}
}
