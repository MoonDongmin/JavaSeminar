package Chapter11.ThinClone;

public class MemberExample {
    public static void main(String[] args){
        //원본 객체 생성
        Member original = new Member("blue","홍길동","1234",25,true);

        //복제 객체를 얻은 후에 패스워드 변경
        Member cloned = original.getMember();
        cloned.password = "6789";

        System.out.println("[복제 객체의 필드값]");
        System.out.println("id: "+cloned.id);
        System.out.println("pwd: "+cloned.password);
        System.out.println("name: "+cloned.name);
        System.out.println("age: "+cloned.age);
        System.out.println("adult: "+cloned.adult);

        System.out.println();
        System.out.println("[원본 객체의 필드값]");
        System.out.println("id: "+original.id);
        System.out.println("pwd: "+original.password);
        System.out.println("name: "+original.name);
        System.out.println("age: "+original.age);
        System.out.println("adult: "+original.adult);
    }
}
