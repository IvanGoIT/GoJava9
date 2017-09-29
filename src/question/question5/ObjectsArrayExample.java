package question.question5;

import question.question5.utils.Dog;

public class ObjectsArrayExample {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{
                new Dog("Bobik23", 500),
                new Dog("Bobik2", 5),
                new Dog("Barsik", 3),
                new Dog("Bobik5", 100),
                new Dog("Bobik22", 1000),
                new Dog("Tuzik", 10)
        }; // new Dog[10];

        int x = 12345;

        Dog dog = dogs[0];

        System.out.println(dog.getName());

        // dogs[0] = null;
        // dog = null;

        System.out.println("Youngest dog name: " + findYoungestDog(dogs).getName());
        System.out.println("Oldest dog name: " + findOldestDog(dogs).getName());
    }

    private static Dog[] addElement(Dog[] dogs) {
        // Увеличение массива на один элемент (абстрактный пример)
        Dog[] tempDogs = new Dog[dogs.length + 1];
        // копирование
        // вставка нового элемента
        dogs = tempDogs;

        return dogs;
    }

    private static Dog findYoungestDog(Dog[] dogs) {
        Dog result = dogs[0];
        for(int i = 1; i < dogs.length; i++) {
            if (result.getAge() > dogs[i].getAge())
                result = dogs[i];
        }
        return result;
    }

    private static Dog findOldestDog(Dog[] dogs) {
        Dog result = dogs[0];
        for(int i = 1; i < dogs.length; i++) {
            if (result.getAge() < dogs[i].getAge())
                result = dogs[i];
        }
        return result;
    }
}
