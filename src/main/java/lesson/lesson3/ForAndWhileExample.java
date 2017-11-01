package lesson.lesson3;

public class ForAndWhileExample {
    public static void main(String[] args) {
        int[] a = new int[10];

        // Цилк - for
        System.out.println("For. Задает массиву значения от 1 до N");
        for(int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        // Цилк - for
        for(int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        // Цилк - while
        System.out.println("While. Добавляет +5 каждому элементу массива...");
        int i = 0; // индекс массива
        while (i < a.length) {
            a[i] = a[i] + 5;
            i++;
        }

        i = 0;
        while (i < a.length) {
            System.out.println("a[" + i + "] = " + a[i]);
            i++;
        }
    }
}
