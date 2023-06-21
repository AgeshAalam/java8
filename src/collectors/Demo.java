package collectors;

import map.Person;
import map.Sample;

import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class Demo {
    public static void main(String[] args) {
        //max //min
        //reduce operation do-->reduce,collect,sum,min,max,....
        /*System.out.println(Sample.createPeople().stream()
                .map(Person::getAge)
                .reduce(0,(total,e)->total+e));*/

        /*System.out.println(
                Sample.createPeople().stream()
                        .mapToInt(Person::getAge)
                        .sum()
        );*/

        /*System.out.println(Sample.createPeople().stream()
                .mapToInt(Person::getAge)
               // .max();(optional value)
               .min())*/
        ;
/*
// maxBy
//o/p:Person object-->Optional[Person{name='john', gender=MALE, age=90}]
       System.out.println(
                Sample.createPeople().stream()
                        .collect(maxBy(Comparator.comparing(Person::getAge)))
                        //.collect(minBy(Comparator.comparing(Person::getAge)))
        );
*/
        /*
        * print only name whose age is highest
        *
        * */

               String result= Sample.createPeople()
                        .stream()
                        .collect(collectingAndThen(
                                maxBy(comparing(Person::getAge)),
                                person->person.map(Person::getName)
                                        .orElse("")
                        ));

        System.out.println(result);
    }
}
