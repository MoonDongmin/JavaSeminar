package Chapater16.StreamPipeExample;

import java.util.Arrays;
import java.util.List;

public class StreamPipeExample {
    public static void main(String[] args){
        List<Member> list = Arrays.asList(
                new Member("홍",Member.MALE,30),
                new Member("김",Member.FEMALE,20),
                new Member("신",Member.MALE,45),
                new Member("박",Member.FEMALE,27)
        );

        double ageAvg = list.stream()
                .filter(m->m.getSex()==Member.MALE)
                .mapToDouble(Member::getAge)
                .average()
                .getAsDouble();

        System.out.println("남자 평균 나이: "+ageAvg);
    }
}
