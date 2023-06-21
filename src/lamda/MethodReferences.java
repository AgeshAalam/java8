package lamda;

import java.util.List;

public class MethodReferences {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 4, 6, 5, 4, 6, 43);
          /*list1.forEach(e->System.out.println(e));
          list1.forEach(System.out::println);
*/
        // list1.stream().map(e->Integer.toString(e)).forEach(System.out::println);
        //list1.stream().map(String::valueOf).forEach(System.out::println);

        /*System.out.println(list1.stream()
                        .map(String::valueOf)
                        .reduce("",String::concat));
                //.reduce(0,Integer::sum));*/

        System.out.println(list1.stream()
                .filter(e -> e % 2 == 0)
                /*.map(e -> e * 2)
                .reduce(0, Integer::sum)*/
                .mapToInt(e->e*2)
                .sum()
          );
    }
}
