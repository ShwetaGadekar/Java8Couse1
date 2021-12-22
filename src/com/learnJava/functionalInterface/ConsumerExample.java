package com.learnJava.functionalInterface;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> c1=(s)-> System.out.println(s.toUpperCase());
		
		c1.accept("java8");

	}

}
