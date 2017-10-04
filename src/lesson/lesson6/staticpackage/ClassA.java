package lesson.lesson6.staticpackage;

public class ClassA {
    public static int y = 0;

    public int x = 0;

    public static void staticDemo() {
        System.out.println("Static demo");
        y = 10;
    }

    public void demo() {
        System.out.println("Demo y = " + y + ", x = " + x);
        x = 10;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
}
