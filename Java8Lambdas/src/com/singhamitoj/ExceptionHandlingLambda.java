package com.singhamitoj;

import java.util.function.BiConsumer;

public class ExceptionHandlingLambda {
	public static void main (String args[]) {
		
		int []someNumbers= {1,4,6,7};
		int key=0;
		
//		1st way
		process(someNumbers, key, (v,k)->{
			try {
				System.out.println(v/k);	
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception occurred ");
			}
			
		});
//		
		process(someNumbers, key, wrapperLambda((v,k)->System.out.println(v/k)));	
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		
		return (v,k) -> {
			try {
				consumer.accept(v, k);
			}
			catch(ArithmeticException r) {
				System.out.println("Exception caught in wrapper Lambda");
			}
		};
	}

	private static void process(int []someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i:someNumbers){
			consumer.accept(i, key);
		}
	}
}
