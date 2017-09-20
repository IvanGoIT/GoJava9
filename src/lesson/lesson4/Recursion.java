package lesson.lesson4;

public class Recursion {

    static int fact(int n) {
        if (n <= 1)
            return 1;

        int x = fact(n - 1);
        return n * x;
    }

    public static void main(String[] args) {
        System.out.println("F(3)=" + fact(3));
        System.out.println("F(5)=" + fact(5));
        System.out.println("F(10)=" + fact(10));
    }
}
