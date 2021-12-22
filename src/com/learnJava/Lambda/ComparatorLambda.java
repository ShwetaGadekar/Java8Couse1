package com.learnJava.Lambda;

import java.util.Comparator;

public class ComparatorLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//java8
		
		Comparator<Integer>  comparator= new Comparator<Integer>() {
			@Override
			public int compare(Integer o1,Integer o2) {
				return o1.compareTo(o2); //0 -> o1==o2
										//1 -> o1>o2
										//-1 -> o1<o2
			}
		};
		
		System.out.println("Result of comparator is : "+comparator.compare(2,2));
		
		Comparator<Integer> comparatorlambda= (Integer a,Integer b)->{return a.compareTo(b);};
		
		
		System.out.println("Result of comparator lambda is : "+comparatorlambda.compare(2,2));
		
		Comparator<Integer> comparatorlambda1= (a,b)->{return a.compareTo(b);};
		
		System.out.println("Result of comparator lambda1 is : "+comparatorlambda1.compare(2,1));
	}

}
