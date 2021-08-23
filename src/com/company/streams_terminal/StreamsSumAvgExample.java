package com.company.streams_terminal;

import com.company.data.Student;
import com.company.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {

    public static int sum() {


        return StudentDataBase.getAllStudents().
                stream().collect(Collectors.summingInt(Student::getNotebook));
    }

    public static double avg() {


        return StudentDataBase.getAllStudents().
                stream().collect(Collectors.averagingInt(Student::getNotebook));
    }

    public static void main(String[] args) {

        System.out.println("Total number of Notebooks:" + sum());

        System.out.println("Avg number of Notebooks:" + avg());
    }
}
