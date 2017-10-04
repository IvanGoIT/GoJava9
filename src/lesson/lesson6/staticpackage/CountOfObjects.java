package lesson.lesson6.staticpackage;

public class CountOfObjects {
    public static int countTotal = 0;
    public static int count = 0;
    public static int countName = 0;

    public CountOfObjects() {
        countTotal++;
        count++;
    }

    public CountOfObjects(String name) {
        countTotal++;
        countName++;
    }
}
