# lab3
# MyArrayListQueue, MyArrayListStack, MyLinkedListQueue, and MyLinkedListStack
## Introduction
This is a set of classes that implement stack and queue data structures using ArrayList and LinkedList data structures in Java.

## MyArrayListQueue
The MyArrayListQueue class implements a queue using an ArrayList that provides following methods:

MyArrayListQueue()
This is the constructor method that initializes the ArrayList.
```
public MyArrayListQueue() {
        queueList = new ArrayList<E>(); //initializing the ArrayList that will hold the elements of the queue
    }
```
void enqueue(E element)
This method adds an element to the back of the queue.
```
    public void enqueue(E element) {
        
        queueList.add(element);
    }
```
boolean isEmpty()
This method returns true if the queue is empty, false otherwise.
```
    public boolean isEmpty() {
        return queueList.isEmpty();
    }
```
E dequeue()
This method removes and returns the front element of the queue. It throws a NoSuchElementException if the queue is empty.
```
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queueList.remove(0);
    }
```
E peek()
This method returns the front element of the queue without removing it. It throws a NoSuchElementException if the queue is empty.
```
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queueList.get(0);
    }
```
int size()
This method returns the number of elements in the queue.
```
    public int size() {
        return queueList.size();
    }
```
## MyArrayListStack
The MyArrayListStack class implements a stack using an ArrayList that provides following methods:

MyArrayListStack()
This is the constructor method that initializes the ArrayList.
```
    public MyArrayListStack() {
        list = new ArrayList<>(); //initializing the ArrayList with constructor
    }
```
void push(E element)
This method adds an element to the top of the stack.
```
    public void push(E element) {
        list.add(element);
    }
```
boolean isEmpty()
This method returns true if the stack is empty, false otherwise.
```
    public boolean isEmpty() {

        return list.isEmpty();
    }
```
int size()
This method returns the number of elements in the stack.
```
    public int size() {
        return list.size();
    }
```
E pop()
This method removes and returns the top element of the stack. It throws an EmptyStackException if the stack is empty.
```
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(size() - 1);
    }
```
E peek()
This method returns the top element of the stack without removing it. It throws an EmptyStackException if the stack is empty.
```
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(size() - 1);
    }
```
## MyLinkedListQueue
The MyLinkedListQueue class implements a queue using a LinkedList that provides the following methods:

MyLinkedListQueue()
This is the constructor method that initializes the LinkedList.
```
    public MyLinkedListQueue() {

        queueList = new LinkedList<E>(); //initializing the LinkedList to hold the elements of the queue
    }
```
void enqueue(E element)
This method adds an element to the back of the queue.
```
    public void enqueue(E element) {
        queueList.addLast(element);
    }
```
boolean isEmpty()
This method returns true if the queue is empty, false otherwise.
```
    public boolean isEmpty() {
        return queueList.isEmpty();
    }
```
E dequeue()
This method removes and returns the front element of the queue. It throws a NoSuchElementException if the queue is empty.
```
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queueList.removeFirst();
    }
```
E peek()
This method returns the front element of the queue without removing it. It throws a NoSuchElementException if the queue is empty.
```
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queueList.getFirst();
    }
```
int size()
This method returns the number of elements in the queue.
```
    public int size() {
        return queueList.size();
    }
```
## MyLinkedListStack
The MyLinkedListStack class implements a stack using a LinkedList that provides the following methods:

MyLinkedListStack()
This is the constructor method that initializes the LinkedList.
```
    public MyLinkedListStack() {

        list = new LinkedList<>(); //initializing the linked list
    }
```
void push(E element)
This method adds an element to the top of the stack.
```
    public void push(E element) {
        list.addFirst(element);
    }

```
boolean isEmpty()
This method returns true if the stack is empty, false otherwise.
```
    public boolean isEmpty() {
        return list.isEmpty();
    }
```
E pop()
This method removes and returns the top element of the stack. It throws an EmptyStackException if the stack is empty.
```
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }
```
E peek()
This method returns the top element of the stack without removing it. It throws an EmptyStackException if the stack is empty.
```
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getFirst();
    }
```
int size()
This method returns the number of elements in the stack.
```
    public int size() {
        return list.size();
    }
```
