package com.learnJava.methodreference;

import com.learnJava.StudentDataBase;
import com.learnJava.data.Student;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThanGradeLevel;


    public static boolean greaterThanGradeLevel(Student s){
        return s.getGradeLevel()>=3;
    }


    public static void main(String[] args) {

        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));

    }
}
