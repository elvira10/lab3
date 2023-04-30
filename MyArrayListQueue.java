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

}
