import java.util.NoSuchElementException;
import java.util.LinkedList;

public class MyLinkedListQueue<E> {
    private LinkedList<E> queueList;
    public MyLinkedListQueue() {

        queueList = new LinkedList<E>(); //initializing the LinkedList to hold the elements of the queue
    }

    /**
     * adds the specified element to the back of the queue
     * @param element the element that is going to be added
     */
    public void enqueue(E element) {
        queueList.addLast(element);
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
        return queueList.removeFirst();
    }

    /**
     * returns the front element of the queue without removing it
     * @return the front element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queueList.getFirst();
    }

    /**
     * returns the number of elements in the queue
     * @return the number of elements in the queue
     */
    public int size() {
        return queueList.size();
    }
}
