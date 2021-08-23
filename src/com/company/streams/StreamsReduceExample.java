package com.company.streams;


import com.company.data.Student;
import com.company.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static int performMultiplication(List<Integer> integers) {

        return integers.stream().reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integers) {

        return integers.stream().reduce((a, b) -> a * b);
    }

    public static Optional<Student> getHighestGPAStudent() {

        return StudentDataBase.getAllStudents().stream().reduce(
                (s1, s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);
    }

    public static void main(String[] args) {
        List<Integer> integer = Arrays.asList(1, 3, 5, 7);
        System.out.println(performMultiplication(integer));
        Optional<Integer> result = performMultiplicationWithoutIdentity(integer);
        System.out.println(result.isPresent());
        System.out.println(result.get());
        Optional<Integer> result1 = performMultiplicationWithoutIdentity(new ArrayList<Integer>());
        System.out.println(result1.isPresent());
        if (result1.isPresent()) {
            System.out.println(result1.get());
        }
        Optional<Student> studentOptional = getHighestGPAStudent();
        if (studentOptional.isPresent()) {
            System.out.println(studentOptional.get());


        }
    }

}
