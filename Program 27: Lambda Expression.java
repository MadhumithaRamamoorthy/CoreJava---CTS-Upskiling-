import java.util.*;

class LambdaDemo {

    public static void main(String[] args) {

        List<String> list =
            Arrays.asList(
                "Banana",
                "Apple",
                "Orange"
            );

        Collections.sort(
            list,
            (a,b) ->
            a.compareTo(b)
        );

        System.out.println(list);
    }
}
