package com.company.parallelstream;

import com.company.data.Student;
import com.company.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample1 {
    public static List<String> sequentialPrintStudentActivities() {

        long startTime = System.currentTimeMillis();
        List<String> studentActivities =

                StudentDataBase.getAllStudents().stream().
                        map(Student::getActivities).
                        flatMap(List::stream).
                        distinct().
                        sorted().
                        collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Duration of the execution of the pipeline in sequential manner:" + duration);
        return studentActivities;

    }

    public static List<String> parallelPrintStudentActivities() {
        long startTime = System.currentTimeMillis();
        List<String> studentActivities =

                StudentDataBase.getAllStudents().stream().parallel().
                        map(Student::getActivities).
                        flatMap(List::stream).
                        distinct().
                        sorted().
                        collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Duration of the execution of the pipeline in parallel manner:" + duration);
        return studentActivities;

    }

    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();


    }
}
