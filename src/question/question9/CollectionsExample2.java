package question.question9;

import question.question9.utils.Person;

import java.util.LinkedList;
import java.util.Stack;

public class CollectionsExample2 {

    static void workWithPerson(Person person) {
        System.out.println(person.name + " получил билет и ушел");
    }

    public static void main(String[] args) {

        LinkedList<Person> queue = new LinkedList<>();

        System.out.println("симуляция работы очереди в кассу (FIFO)");
        System.out.println();

        // симуляция работы очереди в кассу (FIFO)
        // --------------------------------------------
        queue.add(new Person());
        queue.add(new Person());
        queue.add(new Person());

        workWithPerson(queue.poll());

        queue.add(new Person());

        workWithPerson(queue.poll());
        workWithPerson(queue.poll());

        queue.add(new Person());
        queue.add(new Person());
        queue.add(new Person());

        workWithPerson(queue.poll());
        workWithPerson(queue.poll());
        workWithPerson(queue.poll());
        workWithPerson(queue.poll());
        // --------------------------------------------

        System.out.println();
        System.out.println();
        System.out.println("симуляция работы стэка (LIFO)");
        System.out.println();

        Person.refreshCounter();

        Stack<Person> stack = new Stack<>();

        // симуляция работы стэка (LIFO)
        // --------------------------------------------

        stack.push(new Person());
        stack.push(new Person());

        workWithPerson(stack.pop());

        stack.push(new Person());
        stack.push(new Person());

        workWithPerson(stack.pop());

        stack.push(new Person());

        workWithPerson(stack.pop());
        workWithPerson(stack.pop());

        stack.push(new Person());

        workWithPerson(stack.pop());
        workWithPerson(stack.pop());

        // --------------------------------------------
    }
}
