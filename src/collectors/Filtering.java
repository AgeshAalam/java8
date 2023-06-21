package collectors;

import map.Person;

import static java.util.stream.Collectors.*;

public class Filtering {
    public static void main(String[] args) {
/*
        System.out.println(Sample.createPeople().stream()
                        .filter(e->e.getAge()>20)
                .collect(groupingBy(Person::getAge,mapping(Person::getName,toList()))));
*/
        System.out.println(Sample.createPeople().stream()
                .collect(groupingBy(Person::getAge,mapping
                        (Person::getName,filtering(name->name.length()>4,toList())))));



    }

}
