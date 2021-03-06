package com.company.streams;

import com.company.data.Student;
import com.company.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        Predicate<Student> studentPredicate= student -> student.getGradeLevel()>=3;
        Predicate<Student> studentGpaPredicate= student -> student.getGpa()>=3.9;

       Map<String,List<String>> studentsMap= studentList.stream().peek(student -> System.out.println(student)).filter(studentPredicate).
               peek(student -> System.out.println("After 1st filter:"+student)).
               filter(studentGpaPredicate).
               peek(student -> System.out.println("After  2nd filter:"+student)).
               collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentsMap);
    }
}
