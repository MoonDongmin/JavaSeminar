package Chapter8.DefaultMethodExample;

import Chapter08.DefaultMethodExample.MyInterface;

public class MyClassB implements MyInterface {
    @Override
    public void method1(){
        System.out.println("MyClassB-method1() 실행");
    }

    @Override
    public void method2(){
        System.out.println("MyClassB-method2() 실행");
    }
}
