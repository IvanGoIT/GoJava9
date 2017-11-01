package lesson.lesson5;

import lesson.lesson5.animal.Cat;
import lesson.lesson5.animal.Dog;
import lesson.lesson5.animal.data.DataName;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 = new Dog("Bobik", 5);
        Dog dog2 = new Dog("Barsik", 10);
        Dog dog3 = new Dog("Barsik");
        Dog dog4 = new Dog(10);

        dog2.name = "Barsik2000";   // оператора '.'(точка)
                                    // позволяет получить доступ к данным внутри объекта

        dog2.setAge(100);           // сеттер позволяет изменять даже
                                    // приватные поля

        DataName dataName = new DataName();
        Cat.Name name = new Cat.Name();

        Cat cat = new Cat();
        cat.name.firstName = "cat f1";
        cat.name.lastName = "cat f2";

        cat.dataName.firstName = "cat data f1";
        cat.dataName.lastName = "cat data f2";

        cat.show();

        System.out.println();
        System.out.println("dog.name \t" + dog.name + "\t\t"   + dog.getAge());
        System.out.println("dog1.name \t" + dog1.name + "\t\t" + dog1.getAge());
        System.out.println("dog2.name \t" + dog2.name + "\t"   + dog2.getAge());
        System.out.println("dog3.name \t" + dog3.name + "\t\t" + dog3.getAge());
        System.out.println("dog4.name \t" + dog4.name + "\t\t" + dog4.getAge());

        System.out.println();
        dog.show();
        dog1.show();
        dog2.show();
        dog3.show();
        dog4.show();
    }
}
