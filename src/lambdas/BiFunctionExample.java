package lambdas;

import com.company.data.Student;
import com.company.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    public static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> bifunctionStudent =
            (studentList, predicate) -> {

                Map<String, Double> studentGradeMap = new HashMap<>();
                studentList.forEach(student -> {
                    if (predicate.test(student)) {
                        studentGradeMap.put(student.getName(), student.getGpa());
                    }
                });
                return studentGradeMap;

            };

    public static void main(String[] args) {
        System.out.println(bifunctionStudent.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.studentPredicate));
    }
}

