package lesson.lesson4;

public class MethodOverloadExample {

    static int sum(int a, int b, int c, int d) {    // 1 - original
        return a + b + c + d;
    }

    static int sum(int a, int b, int c) {           // 2
        return sum(a, b, c, 0);
    }

    static int sum(int a, int b) {                  // 3
        return sum(a, b, 0);
    }

    static int sum(int[] array) {
        int result = 0;
        for(int value : array)
            result += value;
        return result;
    }

    static String sum(String a, String b) {         // original
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2));
        System.out.println(sum(new int[] {1, 2, 3, 4, 5, 1, 2, 3, 4}));
        System.out.println(sum("1", "2"));
    }
}
