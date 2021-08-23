package lambdas;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class RunnableLambdaExample {


    public static void main(String[] args) {
        /* prior to java 8*/
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        /* Java 8 lambda */

        Runnable runnablelambda = () -> {
            System.out.println("Inside Runnable 2");
        };
        new Thread(runnablelambda).start();

        Runnable runnablelambda1 = () -> System.out.println("Inside Runnable 3");
        new Thread(runnablelambda1).start();
        new Thread(() -> System.out.println("Inside Runnable 4")).start();
    }
}
