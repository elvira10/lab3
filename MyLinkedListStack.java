import java.util.EmptyStackException;
import java.util.LinkedList;
public class MyLinkedListStack<E> {
    private LinkedList<E> list;

    public MyLinkedListStack() {

        list = new LinkedList<>(); //initializing the linked list
    }

    /**
     * adds an element to the top of the stack
     * @param element the element to add to the stack
     */
    public void push(E element) {
        list.addFirst(element);
    }

    /**
     * checks if the stack is empty
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * removes and returns the top element of the stack
     * @return the top element of the stack
     * @throws EmptyStackException if the stack is empty
     */
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }

    /**
     * returns the top element of the stack without removing it
     * @return the top element of the stack
     * @throws EmptyStackException if the stack is empty
     */
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getFirst();
    }

    /**
     * returns the size of the stack
     * @return the size of the stack
     */
    public int size() {
        return list.size();
    }
}