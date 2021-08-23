package com.company.streams;

import com.company.data.Student;
import com.company.data.StudentDataBase;

public class StreamsMapReduceExample {

    private static int noOfNoteBooks() {

        return StudentDataBase.getAllStudents().stream().
                filter(student -> student.getGradeLevel()>=3).
                filter(student -> student.getGender().equals("female"))
                .map(Student::getNotebook).reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        System.out.println("NoOfNoteBooks is:"+ noOfNoteBooks());

    }
}
