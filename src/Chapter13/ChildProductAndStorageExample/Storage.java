package Chapter13.ChildProductAndStorageExample;

public interface Storage <T>{
    public void add(T item, int index);
    public T get(int index);
}
