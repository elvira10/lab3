import java.util.EmptyStackException;
import java.util.LinkedList;
public class MyLinkedListStack<E> {
    private LinkedList<E> list;

    public MyLinkedListStack() {
        list = new LinkedList<>();
    }
    public void push(E element) {
        list.addFirst(element);
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }
}