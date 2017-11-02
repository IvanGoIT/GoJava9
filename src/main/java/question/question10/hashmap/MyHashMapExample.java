package question.question10.hashmap;

import question.question10.flowers.Flower;

public class MyHashMapExample {

    public static void main(String[] args) {
        MyHashMap<String, Flower> flowers = new MyHashMap<>();

        flowers.add("плохой", new Flower("бурьян", -20));
        flowers.add("романтический", new Flower("роза", 100));

        System.out.println(flowers.get("плохой"));

        MyHashMap<String, Integer> numbers = new MyHashMap<>();

        numbers.add("б", 100);
        numbers.add("a", 1);
        numbers.add("d", 222);

        System.out.println(numbers.get("б"));
    }
}
