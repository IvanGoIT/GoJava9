package lesson.lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите A:");
        int a = scanner.nextInt();
        System.out.print("Введите B:");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Переменная А больше чем B");
            System.out.println("Делаем переменную А меньше чем B");
            a = b - 1;
            System.out.println("Теперь переменная А = " + a);
        } else {
            System.out.println("Переменная B больше чем A");
            System.out.println("Делаем переменную B меньше чем A");
            b = a - 1;
            System.out.println("Теперь переменная B = " + b);
        }

        // ------------------------------------------------------

        int max;

        if (a > b) {
            max = a;
            // more code
        } else {
            max = b;
            // more code
        }

        System.out.println("Максимум из А и В = " + max);

        int min;

        if (a > b) min = b;
        else min = a;

        System.out.println("Минимум из А и В = " + min);

        // тернарный оператор - ?
        max = a > b ? a : b;
        min = a < b ? a : b;

        String str = a > b ? "Переменная А больше чем B" : "Переменная B больше чем A";
        System.out.println(str);
    }
}
