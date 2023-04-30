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
    public boolean isEmpty() {
        return queueList.isEmpty();
    }
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queueList.removeFirst();
    }
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queueList.getFirst();
    }
    public int size() {
        return queueList.size();
    }
}
