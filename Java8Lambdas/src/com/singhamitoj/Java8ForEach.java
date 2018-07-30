package com.singhamitoj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEach {
	public static void main(String[] args) {
		
		//creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) myList.add(i);
		//creating sample Collection
		List<Double> myListDouble = new ArrayList<Double>();
		for(int i=0; i<10; i++) myListDouble.add((double)i);
						
		
		//traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println("Iterator Value::"+i);
		}
		
		//traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value::"+t);
			}

		});
		
		//traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);
		
		MyConsumerDouble actionDouble = new MyConsumerDouble();
		myListDouble.forEach(actionDouble);
		
	}

}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::"+t);
	}
}
class MyConsumerDouble implements Consumer<Double>{

	@Override
	public void accept(Double arg0) {
	System.out.println("Consumer impl value using double "+arg0);	 	
	}	
}