package question.question9.utils;

public class Person {
    private static int counter = 1;

    public String name;

    public static void refreshCounter() {
        counter = 1;
    }

    public Person() {
        this.name = "" + counter++;
        System.out.println("Пришел человек " + name);
    }
}
