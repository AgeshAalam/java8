package collectors;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class FlatMap {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3);

        /*System.out.println(list.stream()
                .map(e->List.of(e-1,e+1))
               // .collect(toList())); //[[0, 2], [1, 3], [2, 4]]
                .collect(toSet())); //[[0, 2], [1, 3], [2, 4]]*/


        /*System.out.println(list.stream()
                .map(e->List.of(e-1,e+1))
                //.flatMap(e -> List.of(e - 1, e + 1).stream())
                .collect(toList()));*/

        /*System.out.println(list.stream()
               .flatMap(e -> List.of(e - 1, e + 1).stream())
               // .collect(toList())); //[0, 2, 1, 3, 2, 4]
                .collect(toSet())); //[0, 2, 1, 3, 2, 4]*/

        System.out.println(
                Sample.createPeople()
                        .stream()
                        .flatMap(e->e.getName().describeConstable().stream())
                        .collect(toSet())
        );
    }
}
