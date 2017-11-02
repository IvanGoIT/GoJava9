package question.question10.linkedlist;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("111"); // index - 0
        list.add("222"); // index - 1
        list.add("333"); // index - 2
        list.add("444"); // index - 3
        list.add("555"); // index - 4

        list.print();

        list.remove(2);
        System.out.println();

        list.print();
    }
}
