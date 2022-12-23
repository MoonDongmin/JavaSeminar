package Chapter7.ChildExample;

import Chapter7.ChildExample.Child;
import Chapter7.ChildExample.Parent;

public class ChildExam {
    public static void  main(String[] args){
        Child child = new Child();

        Parent parent = child;
        parent.method1();
        parent.method2();
    }
}
