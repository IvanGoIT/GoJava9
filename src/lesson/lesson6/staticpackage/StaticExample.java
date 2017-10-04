package lesson.lesson6.staticpackage;

public class StaticExample {
    public int x = 0;

    public static void printX(StaticExample obj) {
        System.out.println("x = " + obj.x);

        obj.setY(100);
    }

    public void setY(int y) {
        // something
    }
}
