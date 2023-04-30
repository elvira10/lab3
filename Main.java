public class Main {
    public static void main(String[] args) {
        /*
        MyArrayListStack<Integer> arrayListStack = new MyArrayListStack<>();
        MyLinkedListStack<Integer> linkedListStack = new MyLinkedListStack<>();
        arrayListStack.push(1);
        arrayListStack.push(2);
        arrayListStack.push(3);
        linkedListStack.push(4);
        linkedListStack.push(5);
        System.out.println(arrayListStack.peek());
        System.out.println(linkedListStack.peek());
        System.out.println(arrayListStack.pop());
        System.out.println(linkedListStack.pop());
        System.out.println(arrayListStack.isEmpty());
        System.out.println(linkedListStack.isEmpty());
        System.out.println(arrayListStack.size());
        System.out.println(linkedListStack.size());
        */


        MyArrayListQueue<String> arrayListQueue = new MyArrayListQueue<>();
        MyLinkedListQueue<String> linkedListQueue = new MyLinkedListQueue<>();
        arrayListQueue.enqueue("a");
        arrayListQueue.enqueue("b");
        linkedListQueue.enqueue("c");
        linkedListQueue.enqueue("d");
        linkedListQueue.enqueue("e");
        System.out.println(arrayListQueue.peek());
        System.out.println(linkedListQueue.peek());
        System.out.println(arrayListQueue.dequeue());
        System.out.println(linkedListQueue.dequeue());
        System.out.println(arrayListQueue.isEmpty());
        System.out.println(linkedListQueue.isEmpty());
        System.out.println(arrayListQueue.size());
        System.out.println(linkedListQueue.size());

    }
}