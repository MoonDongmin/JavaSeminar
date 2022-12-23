package Chapter9;

public class Main {
    public static void main(String[] args){
        AJava a = new AJava();

        //인스턴스 멤버 클래스 객체 생성
        AJava.B b = a.new B();
        b.field1 =3;
        b.mehtod1();

        //정적 멤버 클래스 객체 생성
        AJava.C c = new AJava.C();
        c.field1 = 3;
        c.method1();
        AJava.C.field2 = 3;
        AJava.C.method2();

        //로컬 클래스 객체 생성을 위한 메소드 호출
        a.method();
    }
}
