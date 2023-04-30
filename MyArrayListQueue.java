import java.util.NoSuchElementException;
import java.util.ArrayList;

public class MyArrayListQueue<E> {
    private ArrayList<E> queueList;

    public MyArrayListQueue() {
        queueList = new ArrayList<E>(); //initializing the ArrayList that will hold the elements of the queue
    }

    /**
     * adds the element to the back of the queue
     * @param element the element that is going to be added
     */
    public void enqueue(E element) {

        queueList.add(element);
    }

    /**
     * returns true if the queue is empty, false otherwise
     * @return true or false
     */
    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    /**
     * removes and returns the front element of the queue
     * @return the front element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queueList.remove(0);
    }

    /**
     * returns the front element of the queue without removing it from the queue
     * @return the front element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queueList.get(0);
    }

    /**
     * returns the number of elements in the queue
     * @return the number of elements
     */
    public int size() {
        return queueList.size();
    }
}