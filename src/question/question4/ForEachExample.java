package question.question4;

public class ForEachExample {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,3,3,1,0,9};

        // вариант с использованием For
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] * 2 + " ");
        }

        System.out.println();
        System.out.println();

        // вариант с ForEach
        for(int x : array) {
            System.out.print(x * 2 + " ");
        }
    }
}
