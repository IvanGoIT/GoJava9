package lesson.lesson9;

import lesson.lesson9.generics.Data;
import lesson.lesson9.generics.GenericData;
import question.question5.utils.Dog;

public class GenericExample {
    public static void main(String[] args) {

        Data data = new Data();
        data.dataName = "Животное";
        data.dataSize = 100;
        data.data = 0; // не защищено от неверного типа
        data.data = "";// не защищено от неверного типа
        data.data = new Dog("Barsik", 100);

        //

        ((Dog)data.data).setName("");

        // ============================================

        GenericData<Dog> genericData = new GenericData<>();
        genericData.dataName = "Животное";
        genericData.dataSize = 100;
        genericData.data = new Dog("Barsik", 100);
        // genericData.data2 = 0; // защищено от неверного типа

        //

        genericData.data.getName();
    }
}
