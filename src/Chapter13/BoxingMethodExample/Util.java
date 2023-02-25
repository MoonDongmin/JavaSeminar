package Chapter13.BoxingMethodExample;

import Chapter13.BoxEample2.Box;

public class Util {
    public static <T> Box<T> boxing(T t){
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }
}
