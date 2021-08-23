package com.company.streams_terminal;

import com.company.data.Student;
import com.company.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamsMappingExample {


    public static void main(String[] args) {

        List<String> nameList = StudentDataBase.getAllStudents().
                stream()
                .collect(Collectors.mapping(Student::getName, toList()
                ));

        System.out.println("nameList :" + nameList);

        Set<String> namesSet = StudentDataBase.getAllStudents().
                stream()
                .collect(Collectors.mapping(Student::getName, toSet()
                ));

        System.out.println("nameSet :" + namesSet);
    }
}
