package lesson.lesson3;

import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выводить в консоль все числа кроме? ");
        int x = scanner.nextInt();

        int[] a = new int[10];
        // 1 2 3 4 5 6 7 8 9 10
        for(int i = 0; i < a.length; i++)
            a[i] = i + 1;

        // надо вывести в консоль все элементы массива кроме Х
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                continue;
            System.out.println(a[i]);
        }
    }
}
