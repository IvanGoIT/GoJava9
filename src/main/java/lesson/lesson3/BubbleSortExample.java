package lesson.lesson3;

import java.util.Random;

public class BubbleSortExample {
    public static void main(String[] args) {
        Random random = new Random();

        int[] a = new int[10];

        for(int i = 0; i < a.length; i++)
            a[i] = random.nextInt(10);

        for(int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);

        // Bubble Sort
        System.out.println("Bubble Sorting");
        for(int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    // swap
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }

        for(int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}
