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
}