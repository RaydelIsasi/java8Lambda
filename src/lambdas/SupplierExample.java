package lambdas;

import com.company.data.Student;
import com.company.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier=()-> new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"),7);

        System.out.println(" student is: "+studentSupplier.get());
        Supplier<List<Student>> studentListSupplier= ()-> StudentDataBase.getAllStudents();
        System.out.println("List of students are "+studentListSupplier.get());
  }
}
