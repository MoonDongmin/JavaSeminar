package Chapter07.InstanceofExample;

public class InstanceofExam {
    public static void method1(Parent2 parent2){
        if(parent2 instanceof Child2){
            Child2 child2 = (Child2) parent2;
            System.out.println("method1-Child로 변환 성공");
        } else{
            System.out.println("methood1-Child로 변환되지 않음");
        }
    }

    public static void method2(Parent2 parent2){
        Child2 child2 = (Child2) parent2;
        System.out.println("method2-Child로 변환 성공");
    }

    public static void main(String[] args){
        Parent2 parentA = new Child2();
        method1(parentA);
        method2(parentA);

        Parent2 parentB = new Parent2();
        method1(parentB);
        method2(parentB);
    }
}
