package com.learnJava.functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import com.learnJava.StudentDataBase;
import com.learnJava.data.Student;

public class BiPredicatesExample {
	
	 BiPredicate<Integer,Double> biPredicate=(GradeLevel,Gpa) -> GradeLevel>=3 && Gpa>=3.9;
	 
	 BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

	    Consumer<Student> studentConsumer = (student) -> {

	        if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
	            studentBiConsumer.accept(student.getName(),student.getActivities());
	        }
	    };
	    
	    public void printNameandActivities(List<Student> studentList){

	        studentList.forEach(studentConsumer);

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList = StudentDataBase.getAllStudents();

        new BiPredicatesExample().printNameandActivities(studentList);

	}

}
