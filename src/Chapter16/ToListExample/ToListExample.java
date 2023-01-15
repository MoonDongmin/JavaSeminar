package Chapter16.ToListExample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
    public static void main(String[] args){
        List<Student> totalList = Arrays.asList(
                new Student("홍길동",10,Student.Sex.MALE),
                new Student("김수애",6,Student.Sex.FEMALE),
                new Student("신용권",10,Student.Sex.MALE),
                new Student("박수미",6,Student.Sex.FEMALE)
        );

        //남학생
        List<Student> maleList = totalList.stream()
                .filter(s->s.getSex()== Student.Sex.MALE)
                .collect(Collectors.toList());
        maleList.stream()
                .forEach(s->System.out.println(s.getName()));
        System.out.println();

        //여학생
        Set<Student> femaleList = totalList.stream()
                .filter(s->s.getSex()== Student.Sex.FEMALE)
                .collect(Collectors.toCollection(HashSet::new));
        femaleList.stream()
                .forEach(s->System.out.println(s.getName()));
    }
}