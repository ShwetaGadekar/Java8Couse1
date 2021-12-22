package com.learnJava.lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =0; //Local Variable

        Consumer<Integer> c1 = (i1) -> {

            System.out.println("Value is : "+ i);
        };
        c1.accept(null);
	}

}
