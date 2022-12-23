package Chapater16.FromArrayExample;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
    public static void main(String[] args){
        String[] strArray = {"홍","신","감"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(a->System.out.print(a+","));
        System.out.println();

        int[] intArray={1,2,3,4,5};
        IntStream inStream = Arrays.stream(intArray);
        inStream.forEach(a->System.out.println(a+","));
        System.out.println();
    }
}
