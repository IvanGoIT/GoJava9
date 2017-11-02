package question.question10.linkedlist;

public class MyLinkedList<T> {

    private int size = 0;
    private Node<T> first, last;

    public void add(T value) {
        Node<T> node = new Node<>(value);

        if (last == null) {
            last = node;
            first = node;
            return;
        }

        Node<T> tempLast = last;
        last = node;
        tempLast.next = node;
        node.prev = tempLast;

        size++;
    }

    private Node<T> findNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index " + index);
        }

        Node<T> node = first;

        for(int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public T get(int index) {
        return findNode(index).value;
    }

    public void remove(int index) {
        Node<T> node = findNode(index);

        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
    }

    public void print() {
        Node<T> node = first;

        while(node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    private class Node<T> {
        public T value;
        public Node<T> prev, next;

        public Node(T value) {
            this.value = value;
        }
    }
}
