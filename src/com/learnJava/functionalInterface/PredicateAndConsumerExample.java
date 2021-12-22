package com.learnJava.functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.learnJava.StudentDataBase;
import com.learnJava.data.Student;

public class PredicateAndConsumerExample {
	
	static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;

    static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;
    
   

    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

    Consumer<Student> studentConsumer = (student) -> {

        if(p1.and(p2).test(student)){
            studentBiConsumer.accept(student.getName(),student.getActivities());
        }
    };

    Consumer<Student> studentConsumer1 = ((student) -> {

        if(p1.and(p2).test(student)){
            studentBiConsumer.accept(student.getName(),student.getActivities());
        }
    });

    public void printNameandActivities(List<Student> studentList){

        studentList.forEach(studentConsumer);

    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList = StudentDataBase.getAllStudents();

        new PredicateAndConsumerExample().printNameandActivities(studentList);

	}

}
