package lambdas;

import com.company.data.Student;
import com.company.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> studentPredicate = (student) -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = student -> student.getGpa() >= 3.9;

    public static void filterStudentByGradeLevel() {
        System.out.println("filterStudentByGradeLevel");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {

            if (studentPredicate.test(student)) {
                System.out.println(student);

            }
        });
    }

    public static void filterStudents() {
        System.out.println("filterStudents");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {

            if (studentPredicate.or(p2).negate().test(student)) {
                System.out.println(student);

            }else{
                System.out.println(student);
            }
        });
    }

    public static void filterStudentByGpa() {
        System.out.println("filterStudentByGpa");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {

            if (p2.test(student)) {
                System.out.println(student);

            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudents();
    }
}