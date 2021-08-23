package com.company.streams;

import com.company.data.Student;
import com.company.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static List<String> printStudentActivities(){
 List<String>  studentActivities=

            StudentDataBase.getAllStudents().stream().
                    map(Student::getActivities).
                    flatMap(List::stream).
                    distinct().
                    sorted().
                    collect(Collectors.toList());
 return studentActivities;

    }

    public static long getStudentActivitiesCount(){
        long  NoOfstudentActivities=

                StudentDataBase.getAllStudents().stream().
                        map(Student::getActivities).
                        flatMap(List::stream).
                        distinct().
                        count();
        return  NoOfstudentActivities;

    }

    public static void main(String []args){

        System.out.println("printStudentActivities: " +printStudentActivities()
        );
        System.out.println("getStudentActivitiesCount: " +getStudentActivitiesCount()
        );

    }

}
