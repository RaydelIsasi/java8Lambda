package lambdas;

import com.company.data.Student;
import com.company.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    static Consumer<Student> c2 = System.out::println;
    static Consumer<Student> activitiesConsumer=Student::printListActivities;
    public static void main(String[] args) {

        StudentDataBase.getAllStudents().forEach(c2);
        StudentDataBase.getAllStudents().forEach(activitiesConsumer);
    }
}
