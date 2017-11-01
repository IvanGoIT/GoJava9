package question.question4;

public class A {
    public static int y = 0;

    public int x = 0;

    public static void showStatic() {
        System.out.println("y = " + y);
    }

    public void show() {
        System.out.println("y = " + y);
        System.out.println("x = " + x);
    }
}
