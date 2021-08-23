package lambdas;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStream {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("jim");
        names.add("jenny");

      /*  for (String name : names) {

            System.out.println(name);
        }

        for (String name : names) {

            System.out.println(name);
        }*/

        Stream<String> namesStream= names.stream();

        namesStream.forEach(System.out::println);

        namesStream.forEach(System.out::println);


        names.remove(0);
     //   System.out.println(names);


    }
}
