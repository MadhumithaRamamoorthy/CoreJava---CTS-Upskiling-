import java.util.*;
import java.util.stream.*;

record Person(
    String name,
    int age
){}

class RecordDemo {

    public static void main(String[] args) {

        List<Person> persons =
            List.of(
                new Person(
                    "Arun",20
                ),
                new Person(
                    "Priya",17
                ),
                new Person(
                    "Kavi",22
                )
            );

        persons.stream()
               .filter(
                   p -> p.age() >= 18
               )
               .forEach(
                   System.out::println
               );
    }
}
