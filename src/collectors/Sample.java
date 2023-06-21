package collectors;

import map.Gender;
import map.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Sample {
    public static List<Person> createPeople() {
        return Arrays.asList(
                new Person("agesh", Gender.MALE, 20),
                new Person("ahan", Gender.FEMALE, 21),
                new Person("agesh", Gender.MALE, 23),
                new Person("john", Gender.MALE, 90),
                new Person("john", Gender.MALE, 79),
                new Person("Ani", Gender.FEMALE, 36)
        );
    }

    //names to uppercase and age is >30

    public static void main(String[] args) {
        /*createPeople().stream()
                .filter(e->e.getAge()>25)
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                .forEach(System.out::println);*/
                //.reduce();

        //name as key and age as value

        /*System.out.println(createPeople().stream()
                .collect(groupingBy(Person::getName,mapping(Person::getAge,toList()))));*/

        System.out.println(
                createPeople().stream()
                        .collect(toMap(Person::getName,Person::getAge))
        );
    }
}
