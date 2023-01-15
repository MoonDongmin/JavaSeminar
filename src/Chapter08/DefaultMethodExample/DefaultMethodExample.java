package Chapter8.DefaultMethodExample;

import Chapter08.DefaultMethodExample.MyClassA;
import Chapter08.DefaultMethodExample.MyInterface;

public class DefaultMethodExample {
    public static void main(String[] args){
        MyInterface mi1 = new MyClassA();
        mi1.method1();
        mi1.method2();

        MyInterface mi2 = new Chapter8.DefaultMethodExample.MyClassB();
        mi2.method1();
        mi2.method2();
    }
}
