package collectors;

import map.Person;

import java.util.stream.Collectors;

public class Joining {
    public static void main(String[] args) {
        System.out.println(Sample.createPeople().stream()
                .filter(e->e.getAge()>23)
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.joining(",")));

    }
}
