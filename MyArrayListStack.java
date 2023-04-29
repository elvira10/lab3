import java.util.EmptyStackException;
import java.util.ArrayList;
public class MyArrayListStack<E> {
    private ArrayList<E> list;
    public MyArrayListStack() {
        list = new ArrayList<>();
    }
    public void push(E element) {
        list.add(element);
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public int size() {
        return list.size();
    }
}