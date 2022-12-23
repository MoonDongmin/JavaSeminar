package Chapter16.MapAndReduceExample;

import Chapter16.LambdaExpressonsExample.Student;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
    public static void main(String[] args){
        List<Student> studentList = Arrays.asList(
                new Student("홍",10),
                new Student("신",20),
                new Student("홍",30)
        );

        double avg = studentList.stream()
                //중간처리
                .mapToInt(Student::getScore)
                //최종처리
                .average()
                .getAsDouble();

        System.out.println("평균 점수:"+avg);
    }
}
