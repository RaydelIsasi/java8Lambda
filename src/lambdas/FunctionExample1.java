package lambdas;

public class FunctionExample1 {

    public static String performConcat(String str) {
        return FunctionExample.addSomeString.apply(str);

    }

    public static void main(String[] args) {
        String result = performConcat("hello");
        System.out.println("Result: " + result);

    }

}
