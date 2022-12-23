package Chapater16.FilterExample;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args){
        List<String> names = Arrays.asList("홍","신","감","신","신민");

        names.stream()
                .distinct()
                .forEach(n->System.out.println(n));
        System.out.println();

        names.stream()
                .filter(n->n.startsWith("신"))
                .forEach(n->System.out.println(n));
        System.out.println();

        names.stream()
                .distinct()
                .filter(n->n.startsWith("신"))
                .forEach(n->System.out.println(n));
    }
}
