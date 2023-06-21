package lamda;

import java.util.Arrays;
import java.util.List;

public class Interators {
    public static void main(String[] args) {
        /*List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        //external iterators
        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));
        }*/
        List<Integer> list1= List.of(1,4,6,5,4,6,43);
        //external iterators
        /*for (int i = 0; i <list1.size() ; i++) {
            System.out.println(list1.get(i));
        }*/

        list1.forEach(System.out::println);

    }
}
