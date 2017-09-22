package question.question4;

import java.util.Scanner;

public class Recursion {

    public static String recursion(int n) {
        // Базовый случай
        if (n == 1) {
            return "1";
        }
        // Шаг рекурсии / рекурсивное условие
        return recursion(n - 1) + " " + n;
    }

    public static String recursion(int a, int b) {
        // основное условие задачи
        if (a > b) {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / рекурсивное условие
            return a + " " + recursion(a - 1, b);
        } else {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / рекурсивное условие
            return a + " " + recursion(a + 1, b);
        }
    }


    public static void count(int a, int i) {
        i++;
        System.out.println(i);
        if (i < a)
             count(a, i);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(recursion(a));
        System.out.println(recursion(a, b));
        System.out.println(recursion(b, a));

        count(a,0);
    }
}
