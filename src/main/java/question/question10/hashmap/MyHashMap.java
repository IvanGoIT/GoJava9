package question.question10.hashmap;

import java.util.HashSet;

public class MyHashMap <K, V> {

    // HashSet использовать нельзя, либо надо использовать ссылки друг на друга между pairs либо делать массив pairs
    private HashSet<Pair<K, V>> pairs = new HashSet<>();

    public void add(K key, V value) {
        pairs.add(new Pair<>(key, value));
    }

    public V get(K key) {
        for(Pair<K, V> pair : pairs) {
            if (pair.key.equals(key)) {
                return pair.value;
            }
        }
        return null;
    }

    private class Pair<K, V> {
        public K key;
        public V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair<?, ?> pair = (Pair<?, ?>) o;

            return key != null ? key.equals(pair.key) : pair.key == null;
        }

        @Override
        public int hashCode() {
            return key != null ? key.hashCode() : 0;
        }
    }
}
