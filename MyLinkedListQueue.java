import java.util.NoSuchElementException;
import java.util.LinkedList;

public class MyLinkedListQueue<E> {
    private LinkedList<E> queueList;
    public MyLinkedListQueue() {
        queueList = new LinkedList<E>();
    }
    public void enqueue(E element) {
        queueList.addLast(element);
    }
}
