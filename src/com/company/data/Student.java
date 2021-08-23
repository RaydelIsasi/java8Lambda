package com.company.data;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int gradeLevel;

    public int getNotebook() {
        return notebook;
    }

    public void setNotebook(int notebook) {
        this.notebook = notebook;
    }

    private double gpa;
    private String gender;
    List<String> activities = new ArrayList<>();
    private int notebook;

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities, int notebook) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
        this.notebook = notebook;
    }



    public Student() {

    }

    public Student(String s) {
        this.name = s;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void printListActivities() {
        System.out.println(activities);

    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                ", activities=" + activities +
                '}';
    }


}
