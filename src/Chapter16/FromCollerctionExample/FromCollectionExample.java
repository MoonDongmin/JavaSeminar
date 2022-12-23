package Chapter16.FromCollerctionExample;

import Chapter16.LambdaExpressonsExample.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
    public static void main(String[] args){
        List<Student> studentList = Arrays.asList(
                new Student("홍",10),
                new Student("신",20),
                new Student("홍",30)
        );

        Stream<Student> stream = studentList.stream();

        stream.forEach(s-> System.out.println(s.getName()));
    }
}
