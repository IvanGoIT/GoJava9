package question.question4;

public class StaticExample {
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();

        a.x = 10;
        a.y = 10;

        a2.x = 20;
        a2.y = 20;

        System.out.println("a.x = " + a.x);
        System.out.println("a.y = " + a.y);

        System.out.println("a2.x = " + a2.x);
        System.out.println("a2.y = " + a2.y);

        A.y = 100;
        A.showStatic();

        a.show();
        a2.show();
    }
}
