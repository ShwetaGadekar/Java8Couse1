package com.learnJava.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {
	
	static int i=5;

    	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> c1 = (i1) -> {
        	i++;
            System.out.println("Value is : "+(i1+ i));
        };
        c1.accept(4);

	}

}
