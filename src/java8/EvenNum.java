package java8;

import java.util.Arrays;

public class EvenNum {
    public static void main(String[] args) {
        int[] array={1,3,6,4,344,7,8,8,888,040,333,12,001};

        Arrays.stream(array).filter(arr->arr%2==0).forEach(System.out::println);
    }
}
