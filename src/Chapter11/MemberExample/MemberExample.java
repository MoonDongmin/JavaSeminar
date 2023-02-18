package ChapterAPI.MemberExample;

public class MemberExample {
    public static void main(String[] args){
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if(obj1.equals(obj2)){
            System.out.println("1과 2는동등함");
        }else{
            System.out.println("1과 2는 동등하지 않음");
        }

        if(obj1.equals(obj3)){
            System.out.println("1과 3는동등함");
        }else{
            System.out.println("1과 3는 동등하지 않음");
        }

    }
}
