package Chapter11.KeyExample;

import java.util.HashMap;

public class KeyExample {
    public static void main(String[] args) {
        //Key 객체를 식별자로 사용해서 String 값을 저장하는 HashMap 객체 생성
        HashMap<Key, String> hashMap = new HashMap<Key, String>();

        //식별키 "new Key(1)"로 "홍길동"을 저장
        hashMap.put(new Key(1), "홍길동");

        //식별키 "new Key(1)"로 "홍길동"을 읽어옴
        String value = hashMap.get(new Key(1));
        System.out.println(value);
    }
}
