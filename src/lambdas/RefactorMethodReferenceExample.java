package lambdas;

import com.company.data.Student;
import com.company.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {
    static Predicate<Student> studentPredicate = RefactorMethodReferenceExample::greatherThanGradeLevel;

    public static boolean greatherThanGradeLevel(Student s){

        return s.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {
        System.out.println(studentPredicate.test(StudentDataBase.studentSupplier.get()));
    }

}
