package lesson.lesson6.staticpackage;

import lesson.lesson6.staticpackage.ClassA;
import lesson.lesson6.staticpackage.CountOfObjects;
import lesson.lesson6.staticpackage.StaticExample;

public class Main {
    static StaticExample obj = new StaticExample();

    static void staticExample() {
        ClassA objectA1 = new ClassA();
        ClassA objectA2 = new ClassA();
        ClassA objectA3 = new ClassA();
        ClassA objectA4 = new ClassA();

        objectA1.setY(1);
        objectA2.setY(10);
        objectA3.setY(100);
        objectA4.setY(1000);

        objectA1.x = 1;
        objectA2.x = 10;
        objectA3.x = 100;
        objectA4.x = 1000;

        objectA2.setY(10000);

        objectA1.demo();
        objectA2.demo();
        objectA3.demo();
        objectA4.demo();
    }

    static void staticExample2() {
        CountOfObjects obj1 = new CountOfObjects();
        CountOfObjects obj2 = new CountOfObjects();
        CountOfObjects obj3 = new CountOfObjects();
        CountOfObjects obj4 = new CountOfObjects();

        System.out.println(CountOfObjects.count);
    }

    public static void main(String[] args) {
        // ClassA.y = 100;
        // ClassA.staticDemo();

        obj.x = 200;
        StaticExample.printX(obj);
    }
}
