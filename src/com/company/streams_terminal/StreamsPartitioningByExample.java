package com.company.streams_terminal;

import com.company.data.Student;
import com.company.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamsPartitioningByExample {


    public static void partitioningBy_1() {
        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

        Map<Boolean, List<Student>> partitioningMap = StudentDataBase.getAllStudents().
                stream().
                collect(partitioningBy(gpaPredicate));
        System.out.println(partitioningMap);
    }

    public static void partitioningBy_2() {
        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

        Map<Boolean, Set<Student>> partitioningMap = StudentDataBase.getAllStudents().
                stream().
                collect(partitioningBy(gpaPredicate,toSet()));
        System.out.println(partitioningMap);
    }

    public static void main(String[] args) {

      //  partitioningBy_1();
        partitioningBy_2();
    }

}
