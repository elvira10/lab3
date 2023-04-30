import java.util.NoSuchElementException;
import java.util.ArrayList;

public class MyArrayListQueue<E> {
    private ArrayList<E> queueList;
    public MyArrayListQueue() {
        queueList = new ArrayList<E>();
    }
    public void enqueue(E element) {
        queueList.add(element);
    }
    public boolean isEmpty() {
        return queueList.isEmpty();
    }
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queueList.remove(0);
    }
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queueList.get(0);
    }
}
