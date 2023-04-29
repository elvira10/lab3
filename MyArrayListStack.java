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
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(size() - 1);
    }
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(size() - 1);
    }
}