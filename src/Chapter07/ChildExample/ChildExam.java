package Chapter07.ChildExample;

public class ChildExam {
    public static void  main(String[] args){
        Child child = new Child();

        Parent parent = child;
        parent.method1();
        parent.method2();
    }
}
