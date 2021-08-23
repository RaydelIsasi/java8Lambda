package lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {
  static  int value=4;

    public static void main(String [] args){


        Consumer<Integer> integerConsumer=(i)->{
            value++;
            System.out.println(value+i);
        };
        integerConsumer.accept(4);
    }

}
