package com.company.streams_terminal;

import com.company.data.Student;
import com.company.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {

    public static void groupStudentsByGender() {

        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().
                stream().
                collect(Collectors.groupingBy(Student::getGender));
        System.out.println(studentMap);
    }

    public static void customizedGroupingBy() {

        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().
                stream().
                collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUSTANDING" : "AVERAGE"));
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_1() {

        Map<Integer, Map<String, List<Student>>>
                studentMap = StudentDataBase.getAllStudents().
                stream().
                collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUSTANDING" : "AVERAGE")));
        ;

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_2() {

        Map<String, Integer>
                studentMap = StudentDataBase.getAllStudents().
                stream().
                collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNotebook)));
        ;

        System.out.println(studentMap);
    }

    public static void threeArgumentsGroupingBy() {

        Map<String, Set<Student>>
                studentMap = StudentDataBase.getAllStudents().
                stream().
                collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, toSet()));
        ;

        System.out.println(studentMap);
    }

    public static void calculateTopGpa() {

        Map<Integer, Student> studentMapOptional = StudentDataBase.getAllStudents().
                stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println(studentMapOptional);

    }

    public static void calculateLeastGpa() {

        Map<Integer, Student> studentMapOptional = StudentDataBase.getAllStudents().
                stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println(studentMapOptional);

    }

    public static void main(String[] args) {

        // groupStudentsByGender();
        //   customizedGroupingBy();
        //      twoLevelGrouping_1();
        //twoLevelGrouping_2();

    //    threeArgumentsGroupingBy();
     //   calculateTopGpa();
        calculateLeastGpa();
    }


}
