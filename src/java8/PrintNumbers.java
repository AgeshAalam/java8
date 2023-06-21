package java8;

import java.util.stream.IntStream;

//print 1 to 100 using java 8
public class PrintNumbers {

    public static void main(String[] args) {
        IntStream.range(1,101).forEach(System.out::println);
    }
}
