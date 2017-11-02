package question.question10;

import question.question10.flowers.Flower;
import question.question10.flowers.FlowerStore;

public class SplitFilesSaver {
    public static void main(String[] args) {
        FlowerStore store = new FlowerStore();
//        store.flowers.add(new Flower("Роза", 10));
//        store.flowers.add(new Flower("Ромашка", 111));
//        store.flowers.add(new Flower("Лилия", 15));
//        store.flowers.add(new Flower("Тюльпан", 13));
//        store.flowers.add(new Flower("Пион", 20));


        // store.save("files/questions10/store_save.txt");

        store.load("files/questions10/store_save.txt");

        System.out.println(store);
    }
}
