package java8;

import java.util.List;

import static java8.Person.Gender.FEMALE;
import static java8.Person.Gender.MALE;


public class Person {
    public static void main(String[] args) {
        List<People> peopleList = List.of(
                new People("Ram", MALE),
                new People("sita", FEMALE),
                new People("ahan", FEMALE)
        );
        /*List<People> femalelist=new ArrayList<>();
        for (People people : peopleList) {
          if(FEMALE.equals(people.gen)){
              femalelist.add(people);
          }*/

             peopleList.stream().filter(s -> s.gen == FEMALE).forEach(System.out::println);
                    //collect(Collectors.toList());
            //System.out.println(collect);

            //femalelist.forEach(System.out::println);

    }

    private static class People {
        String name;
        Gender gen;

        @Override
        public String toString() {
            return "People{" +
                    "name='" + name + '\'' +
                    ", gen=" + gen +
                    '}';
        }

        public People(String name, Gender gen) {
            this.name = name;
            this.gen = gen;
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
