package lambdas;

import com.company.data.Student;
import com.company.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerExample {

    public static void nameAndActivities() {
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> {

            System.out.println(name + ": " + activities);
        };
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student) -> {
            biConsumer.accept(student.getName(), student.getActivities());
        });

    }

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println(" Value of a: " + a + " Value of b " + b);
        };
        biConsumer.accept("java7", "java8");


        BiConsumer<Integer, Integer> multiply = (a, b) -> {
            System.out.println("Multiplication is: " + (a * b));
        };
        BiConsumer<Integer, Integer> division = (a, b) -> {
            System.out.println("The result of division is:" + (a / b));
        };
        multiply.andThen(division).accept(10, 5);
        nameAndActivities();
    }


}
