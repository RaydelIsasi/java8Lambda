package com.company.streams_terminal;

import com.company.data.Student;
import com.company.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamsMinByMaxByExample {

    public static Optional<Student> minBy_example() {
        return StudentDataBase.getAllStudents().
                stream().
                collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));

    }


    public static Optional<Student> maxBy_example() {
        return StudentDataBase.getAllStudents().
                stream().
                collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));

    }

    public static void main(String[] args) {

        System.out.println(minBy_example().isPresent() ? minBy_example().get() : "Not Found"
        );

        System.out.println(maxBy_example().isPresent() ? maxBy_example().get() : "Not Found"
        );
    }
}