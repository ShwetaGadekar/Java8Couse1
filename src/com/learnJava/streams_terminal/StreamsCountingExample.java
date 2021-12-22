package com.learnJava.streams_terminal;

import com.learnJava.StudentDataBase;

import static java.util.stream.Collectors.counting;

public class StreamsCountingExample {

    public static long count(){

        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(counting());
    }

    public static void main(String[] args) {

        System.out.println("Student having Gpa greater than 3.9 is="+count());
    }
}
