package Chapater16.MaleStudentExample;

import Chapater16.MlalStudent.MaleStudent;
import Chapater16.ToListExample.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaleStudentExample {
    public static void main(String[] args){
        List<Student> totalList = Arrays.asList(
                new Student("홍길동",10,Student.Sex.MALE),
                new Student("김수애",10,Student.Sex.FEMALE),
                new Student("신용권",10,Student.Sex.MALE),
                new Student("박수미",10,Student.Sex.FEMALE)
        );

        MaleStudent maleStudent = totalList.parallelStream()
                .filter(s->s.getSex() == Student.Sex.MALE)
                .collect(MaleStudent::new, MaleStudent :: accumulate, MaleStudent:: combine);

        maleStudent.getList().stream()
                .forEach(s->System.out.println(s.getName()));
    }
}
