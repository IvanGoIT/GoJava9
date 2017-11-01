package question.question6;

public class FinalStaticConstructorExample {
    private final int date;

    public FinalStaticConstructorExample(int x) {
        this.date = x;
        System.out.println("date = " + this.date);
    }
}
