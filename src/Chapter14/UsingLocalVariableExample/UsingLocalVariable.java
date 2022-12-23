package Chapter14.UsingLocalVariableExample;

public class UsingLocalVariable {
    void method(int arg){ //arg는 final특성을 가짐
        int localVar =40;  //localVar는 final특성을 가짐.

        MyFuntionalInterface fi = () -> {
            System.out.println("arg: "+arg);
            System.out.println("localVar: " + localVar+"\n");
        };
        fi.method();
    }
}
