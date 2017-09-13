package lesson.lesson3;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Что найти? ");
        int x = scanner.nextInt();


        int[] a = new int[10];
        // 1 2 3 4 5 6 7 8 9 10
        for(int i = 0; i < a.length; i++)
            a[i] = i + 1;

        // Задача найти хотябы одно число X в массиве. Если есть то вывести это.
        for(int i = 0; i < a.length; i++) {
            System.out.println("Сравниваем элемент под индексом " + i);
            if(a[i] == x) {
                System.out.println("X найден!");
                break;
            }
        }
    }
}
