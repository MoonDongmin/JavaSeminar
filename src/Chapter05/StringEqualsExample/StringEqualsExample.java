package Chapter05.StringEqualsExample;

public class StringEqualsExample {
    public static void main(String[] args){
        String strv1 = "신민철";
        String strv2 = "신민철";

        if(strv1 == strv2){
            System.out.println("strv1과 strv2의 참조가 같음");
        }else{
            System.out.println("strv1과 strv2의 참조가 다름");
        }

        if(strv1.equals(strv2)){
            System.out.println("strv1과 strv2의 문자열이 같음");
        }

        String strv3 = new String("신민철");
        String strv4 = new String("신밀철");

        if(strv3 == strv4){
            System.out.println("strv3과 strv4의 참조가 같음");
        }else{
            System.out.println("strv3과 strv4의 참조가 다름");
        }

        if(strv3.equals(strv4)){
            System.out.println("strv3과 strv4의 문자열이 같음");
        }
    }
}
