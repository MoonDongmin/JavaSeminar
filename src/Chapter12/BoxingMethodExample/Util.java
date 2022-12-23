package Chapter12.BoxingMethodExample;

import Chapter12.BoxEample2.Box;

public class Util {
    public static <T> Box<T> boxing(T t){
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }
}
