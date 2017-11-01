package lesson.lesson7;

import lesson.lesson7.animal.CanShow;
import lesson.lesson7.animal.simple.BaseAnimal;
import lesson.lesson7.animal.simple.Cat;
import lesson.lesson7.animal.simple.Snake;
import lesson.lesson7.animal.simple.Wolf;
import lesson.lesson7.animal.types.AnimalBirds;
import lesson.lesson7.animal.types.AnimalLegs;
import lesson.lesson7.animal.types.AnimalSnake;

public class Main {

    private static void snakeExample() {
        Snake snake1 = new Snake();
        Snake snake2 = new Snake("Очень Длинный змей", 1, 50);
        Snake snake3 = new Snake("Длинный змей", 10, 5, 5);

        System.out.println("snake1: ");
        System.out.println("\t name:   " + snake1.getName());
        System.out.println("\t age:    " + snake1.getAge());
        System.out.println("\t weight: " + snake1.getWeight());
        System.out.println("\t length: " + snake1.getLength());


        System.out.println("snake2: ");
        System.out.println("\t name:   " + snake2.getName());
        System.out.println("\t age:    " + snake2.getAge());
        System.out.println("\t weight: " + snake2.getWeight());
        System.out.println("\t length: " + snake2.getLength());


        System.out.println("snake3: ");
        System.out.println("\t name:   " + snake3.getName());
        System.out.println("\t age:    " + snake3.getAge());
        System.out.println("\t weight: " + snake3.getWeight());
        System.out.println("\t length: " + snake3.getLength());
    }

    private static void extendsExample() {
        BaseAnimal animal = new BaseAnimal("x", 10, 10);
        Wolf wolf = new Wolf("Волк", 5, 20);
        Snake snake = new Snake("Очень Длинный змей", 1, 50);

        System.out.println("age animal: " + animal.getAge());
        System.out.println("name animal: " + animal.getName());

        System.out.println("age wolf: " + wolf.getAge());
        System.out.println("age snake: " + snake.getAge());
        System.out.println("length snake: " + snake.getLength());
    }

    private static void methodOverrideExample() {
        Cat cat1 = new Cat("Kitty", 10, 10);
        Cat cat2 = new Cat("Kitty2", 1, 5);

        System.out.println("cat1: ");
        System.out.println("\t name:   " + cat1.getName());
        System.out.println("\t age:    " + cat1.getAge());
        System.out.println("\t weight: " + cat1.getWeight());

        System.out.println("cat2: ");
        System.out.println("\t name:   " + cat2.getName());
        System.out.println("\t age:    " + cat2.getAge());
        System.out.println("\t weight: " + cat2.getWeight());
    }

    private static void abstractClassExample() {
        AnimalBirds bird1 = new AnimalBirds("Ворона", 10, 10);
        AnimalLegs dog = new AnimalLegs("Барсик", 1, 20);
        AnimalLegs cat = new AnimalLegs("Kitty", 1, 5);
        AnimalSnake cobra = new AnimalSnake("Cobra bob", 20, 100);

        bird1.movement();
        dog.movement();
        cobra.movement();
        cat.movement();
    }

    public static void main(String[] args) {
        extendsExample();
        System.out.println("\n\n");

        snakeExample();
        System.out.println("\n\n");

        methodOverrideExample();
        System.out.println("\n\n");

        abstractClassExample();
        System.out.println("\n\n");

        AnimalBirds bird1 = new AnimalBirds("Ворона", 10, 10);
        AnimalLegs dog = new AnimalLegs("Барсик", 1, 20);
        AnimalLegs cat = new AnimalLegs("Kitty", 1, 5);
        AnimalSnake cobra = new AnimalSnake("Cobra bob", 20, 100);

        CanShow[] canShows = new CanShow[] { bird1, dog, cat, cobra };
        for (CanShow canShow: canShows) {
            canShow.show();
        }
    }
}
