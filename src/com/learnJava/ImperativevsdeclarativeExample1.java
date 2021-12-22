package com.learnJava;

import java.util.stream.IntStream;

public class ImperativevsdeclarativeExample1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//#Sum of 100 numbers from range 0 to 1000#
		 //#Imperative style #
		
		
		int sum=0;
		for(int i=0;i<=100;i++) {
			
			sum=sum+i;    // shared mutable state and its sequential anf it will go step by step
                         // and it will have issues if we try to run the code in multithreaded environment
		}
		
		System.out.println("Sum Result imperative : "+sum);
		
		//Declarative style
		
		 int sum1= IntStream.rangeClosed(0,100)
				    .parallel()
	                .sum();

	        System.out.println("Declarative sum result  : " + sum1);

		

	}
	

}
