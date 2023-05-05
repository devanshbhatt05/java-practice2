package streamPrac;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPrac {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,2,1,6,4,5);

         Stream<Integer> data = nums.stream();
     // data.forEach(n->System.out.println(n));

        //  Stream<Integer> oddData = data.filter(i -> i%2!=0);

        // Stream<Integer> subtractedData = oddData.map(k ->k-5); 
        // oddData.forEach(n -> System.out.println(n));


        nums.stream()
                .filter(n -> n%2!=0)
                .sorted()
                .map(n-> n*2)
                .forEach(n->System.out.println(n));



    }
}
