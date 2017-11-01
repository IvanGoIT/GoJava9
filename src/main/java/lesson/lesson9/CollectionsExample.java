package lesson.lesson9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class CollectionsExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("sdsasd");
        list.add("sdsasd2");
        list.add("sdsa321312sd");

        Iterator<String> iterator = list.iterator();

        // быстрый и оптимальный способ
        while(iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }

        // медленный и не продуктивный
        for(int i = 0; i < list.size(); i++) {
            String value = list.get(i);
            System.out.println(value);
        }
    }
}
