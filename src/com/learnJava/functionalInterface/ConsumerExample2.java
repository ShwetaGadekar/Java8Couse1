package com.learnJava.functionalInterface;

import java.util.List;
import java.util.function.Consumer;

import com.learnJava.StudentDataBase;
import com.learnJava.data.Student;

public class ConsumerExample2 {
	static Consumer<Student> c2=(Student)  -> System.out.println(Student);
	static Consumer<Student> c3=(Student)  -> System.out.print(Student.getName());
	static Consumer<Student> c4=(Student)  -> System.out.println(Student.getActivities());
	
	public static void printName() {
		
		List<Student> studentList=StudentDataBase.getAllStudents();
		
		studentList.forEach(c2);
		
	}
	public static void printNameAndActivities() {
		
		List<Student> studentList=StudentDataBase.getAllStudents();
		
		studentList.forEach(c3.andThen(c4));//consumer chaining
		
	}
	
	public static void printNameAndActivitiesUsingCondition() {
		
		System.out.println("printNameAndActivitiesUsingCondition:");
		List<Student> studentList=StudentDataBase.getAllStudents();
		
		studentList.forEach((student ->{
			if(student.getGradeLevel()>=3 && student.getGpa()>=3.9) {
				c3.andThen(c4).accept(student);
				
			}
			
		}));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printName();
		printNameAndActivities();
		printNameAndActivitiesUsingCondition();
		

	}

}
