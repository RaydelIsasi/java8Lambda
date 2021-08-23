package com.company.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int maxValue(List<Integer> integers) {


        return integers.stream().reduce(0, (x, y) -> x > y ? x : y);
    }

    public static Optional<Integer> minValue(List<Integer> integers) {


        return integers.stream().reduce((x, y) -> x < y ? x : y);
    }

    public static Optional<Integer> maxValueOptional(List<Integer> integers) {


        return integers.stream().reduce((x, y) -> x > y ? x : y);
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(6, 7, 8, 9, 10);
        /*System.out.println("The max element of the list is: " + maxValue(integers));

        System.out.println(maxValueOptional(new ArrayList<>()).isPresent());
        if(maxValueOptional(new ArrayList<>()).isPresent()){
            System.out.println("Max value using optional:"+ maxValueOptional(new ArrayList<>()).get());

        } else
        {
            System.out.println("No max value found");
        }*/

        Optional<Integer> minValue = minValue(integers);
        if (minValue.isPresent()) {
            System.out.println("The min value is " + minValue.get());
        } else {
            System.out.println("The list is empty");
        }

    }
}
