package com.learnJava.functionalInterface;

import com.learnJava.StudentDataBase;
import com.learnJava.data.Student;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerEx {
	
	public static void nameAndActivities(){

        BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

        Consumer<String> stringConsumer = (name) -> System.out.println("name is  :" + name);

        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach((s) -> studentBiConsumer.accept(s.getName(),s.getActivities()));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 BiConsumer<String, String> biConsumer = (a,b) -> {
	            System.out.println(" a : "  +  a + " b : " + b );
	        };
	        biConsumer.accept("java7" , "java8");

	        BiConsumer<Integer, Integer> multiply = (a,b) -> {
	            System.out.println("Multiplication : " + (a * b));
	        };


	        BiConsumer<Integer, Integer> addition = (a,b) -> {
	            System.out.println("Addition : " + (a + b));
	        };
	        
	        BiConsumer<Integer, Integer> Substraction = (a,b) -> {
	            System.out.println("Substraction : " + (a - b));
	        };

	        BiConsumer<Integer, Integer> division = (a,b) -> {
	            System.out.println("Division : "  + (a / b));
	        };


	        multiply.andThen(addition).andThen(division).andThen(Substraction).accept(10,5);


	        nameAndActivities();


	}

}
