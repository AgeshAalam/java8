package collectors;

import map.Gender;
import map.Sample;

import static java.util.stream.Collectors.partitioningBy;

public class Partitioning {
    public static void main(String[] args) {
        System.out.println(Sample.createPeople()
                .stream()
                .collect(partitioningBy(person -> person.getGender()== Gender.FEMALE)));
    }
}
