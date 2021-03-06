package com.learnJava.functionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.learnJava.StudentDataBase;
import com.learnJava.data.Student;

public class FunctionStudentExample {
	
	static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {

        Map<String, Double> studentGrademap = new HashMap<>();
        students.forEach((student -> {
            if(PredicateStudentExample.p1.test(student)){
                studentGrademap.put(student.getName(),student.getGpa());
            }

        }));
        return studentGrademap;

    });

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
		
	}

}
