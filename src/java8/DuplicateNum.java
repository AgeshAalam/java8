package java8;

import java.util.List;

public class DuplicateNum {
    public static void main(String[] args) {

        List<Integer> list=List.of(32,1,32,11,35,7,8,90,2,8,35);
        list.stream().distinct().forEach(System.out::println);


    }
}
