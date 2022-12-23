package Chapter14.PredicateAndNegateExample;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateAndNegateExample {
    public static void main(String[] args){
        IntPredicate predicateA = a -> a%2 ==0;

        IntPredicate predicateB = (a) -> a%3 ==0;

        IntPredicate predicateAB;
        boolean result;

        predicateAB = predicateA.and(predicateB);
        result = predicateAB.test(9);
        System.out.println("9는 2와 3의 배수입니까?"+result);

        predicateAB = predicateA.or(predicateB);
        result = predicateAB.test(9);
        System.out.println("9는 2 또는 3의 배수입니까?"+result);

        predicateAB = predicateA.negate();
        result = predicateAB.test(9);
        System.out.println("9는 홀수입니까?"+result);
    }
}
