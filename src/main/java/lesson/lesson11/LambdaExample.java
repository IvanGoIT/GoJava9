package lesson.lesson11;

public class LambdaExample {

    static void sum(int a, int b) {
        System.out.println("a + b = " + (a+b));
    }

    static void multiply(int a, int b) {
        System.out.println("a + b = " + (a+b));
    }

    static void calculate(Runnable task) {
        task.run();
    }

    public static void main(String[] args) {
        sum(2, 2);

        calculate(() -> sum(2, 2));
        calculate(() -> multiply(2, 5));
        calculate(() -> {
            System.out.println("a - b = " + (10 - 2));
        });
    }
}
