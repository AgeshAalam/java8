package collectors;

import map.Person;

import static java.util.stream.Collectors.*;

public class Grouping {
    public static void main(String[] args) {
        //{agesh=[21, 23], ahan=[21], john=[30], Ani=[30], ram=[21]}
        //name as key and ages as values
        System.out.println(Sample.createPeople().stream()
                .collect(groupingBy(Person::getName
                        ,mapping(Person::getAge,toList()))));
    }
}
