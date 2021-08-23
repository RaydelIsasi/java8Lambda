package com.company.streams;

import com.company.data.Student;
import com.company.data.StudentDataBase;

public class StreamsMatchExample {
    public static boolean allMatch() {

        return StudentDataBase.getAllStudents().stream().allMatch(student -> student.getGpa() >= 3.5);
    }

    public static boolean anyMatch() {

        return StudentDataBase.getAllStudents().stream().anyMatch(student -> student.getGpa() >= 4.0);
    }

    public static boolean noneMatch() {

        return StudentDataBase.getAllStudents().stream().noneMatch(student -> student.getGpa() >= 4.0);
    }

    public static void main(String[] args) {
        System.out.println("Result of all Match: " + allMatch());

        System.out.println("Result of any Match: " + anyMatch());

        System.out.println("Result of none Match: " + noneMatch());

    }
}
