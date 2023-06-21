package parallel_streams;

import java.util.List;

import static java.lang.Thread.sleep;
import static java.util.List.*;

public class EvenSquare {
    public static void main(String[] args) {
        List<Integer> list= of(1,2,3,4,5,6,7,8,9,10);

        list.stream()
                .mapToInt(e-> {
                    try {
                        return transform(e);
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                //.parallel()
                .forEach(System.out::println);

        //System.out.println(list);
    }

    private static int transform(Integer e) throws InterruptedException {
        sleep(1000);
        return e*1;
    }
}
