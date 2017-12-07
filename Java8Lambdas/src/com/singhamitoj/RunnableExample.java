package com.singhamitoj;

public class RunnableExample {

	
	public static void main(String args[]) {
		
//		With Lambda Expression
		Thread th= new Thread(()-> System.out.println("Hello World"));
		th.run();
		
//		With inner class
		
		Thread inT= new Thread() {
			public void run() {
				System.out.println("Hello Inner class");
			}
		};
		inT.run(); 
	}
}
