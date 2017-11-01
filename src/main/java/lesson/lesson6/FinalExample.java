package lesson.lesson6;

public class FinalExample {
    public static final int DEFAULT_X = -1;

    private final int x;

    public FinalExample(int x) {
        this.x = x;
    }

    public FinalExample() {
        this.x = DEFAULT_X;
    }
}
