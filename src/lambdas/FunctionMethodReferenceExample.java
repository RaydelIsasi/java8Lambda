package lambdas;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    static Function<String,String> functionToUpperCase=(s)-> s.toUpperCase();
    static Function<String,String> functionToUpperCaseMethodReference=String::toUpperCase;

    public static void main(String[] args) {

        System.out.println(functionToUpperCase.apply("java8"));
        System.out.println(functionToUpperCaseMethodReference.apply("java8"));
    }
}
