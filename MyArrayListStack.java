import java.util.EmptyStackException;
import java.util.ArrayList;
public class MyArrayListStack<E> {
    private ArrayList<E> list;
    public MyArrayListStack() {
        list = new ArrayList<>(); //initializing the ArrayList with constructor
    }

    /**
     * pushes an element onto the top of the stack
     * @param element the element to push onto the stack
     */
    public void push(E element) {

        list.add(element);
    }

    /**
     * checks if the stack is empty
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {

        return list.isEmpty();
    }

    /**
     * returns the number of elements in the stack
     * @return the size of the stack
     */
    public int size() {

        return list.size();
    }

    /**
     * removes and returns the element at the top of the stack
     * @return the element at the top of the stack
     * @throws EmptyStackException if the stack is empty
     */
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(size() - 1);
    }

    /**
     * returns the element at the top of the stack without removing it
     * @return the element at the top of the stack
     * @throws EmptyStackException if the stack is empty
     */
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(size() - 1);
    }
}