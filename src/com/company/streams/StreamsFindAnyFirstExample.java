package com.company.streams;

import com.company.data.Student;
import com.company.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent() {
        return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() >= 3.9).findAny();

    }

    public static Optional<Student> findFirstStudent() {
        return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() >= 4.1).findFirst();

    }

    public static void main(String[] args) {
        Optional<Student> findAnyStudent = findAnyStudent();
        Optional<Student> findFirstStudent = findFirstStudent();

        if (findAnyStudent.isPresent()) {

            System.out.println("Student found:" + findAnyStudent.get());
        } else {
            System.out.println("No student matches the criteria");
        }

        if (findFirstStudent.isPresent()) {

            System.out.println("Student found using find first:" + findFirstStudent.get());
        } else {
            System.out.println("No student matches the criteria");

        }
    }
}
