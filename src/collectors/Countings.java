package collectors;

import map.Person;

import java.util.Map;

import static java.util.stream.Collectors.*;

public class Countings {
    public static void main(String[] args) {
//{agesh=2, ahan=1, john=2, Ani=1, ram=1}

        /*Map<String, Long> collect = Sample.createPeople()
                .stream().collect(groupingBy(Person::getName, counting()));
        System.out.println(collect);*/

        //counting is Long if we need as Integer then we can use countingAndThen
        //groupingBy() and mapping takes-->(function,Collector)
//where as collectingAndThen takes-->(Collector,function)

        Map<String, Integer> collect1 = Sample.createPeople()
                .stream().collect(groupingBy
                        (Person::getName, collectingAndThen(counting(), Long::intValue)));
        System.out.println(collect1);
    }
}
