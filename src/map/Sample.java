package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Sample {

    public static List<Person> createPeople() {
        return Arrays.asList(
                new Person("agesh", Gender.MALE, 21),
                new Person("ahan", Gender.FEMALE, 21),
                new Person("ram", Gender.MALE, 21),
                new Person("agesh", Gender.MALE, 23),
                //new Person("john", Gender.MALE, 30),
                new Person("john", Gender.MALE, 30),
                new Person("Ani", Gender.FEMALE, 30)
        );
    }

    public static void main(String[] args) {
        List<Person> list=createPeople();
        //show name and age as key & gender as value
        /*System.out.println(list.stream()
        .collect(Collectors.toMap(
                person -> person.getName()+"--"+person.getAge(),person -> person.getGender()
        )));*/

        System.out.println(list.stream()
                .collect(groupingBy(Person::getName,mapping(Person::getAge,toList()))));


    }
}
