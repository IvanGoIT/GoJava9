package question.question3;

import java.util.Arrays;

public class JavaUtilArrayUsage {
    public static void main(String[] args) {

        /*
        int[] array = new int[] {1, 2, 1, 3, 3};
        int[] clone = Arrays.copyOf(array, array.length);
        */

        int[] array = new int[] {1, 2, 1, 3, 3};
        int[] clone = new int[array.length];

        System.arraycopy(array, 2, clone, 1, 3);

        // for
        for(int i = 0; i < clone.length; i++) {
            System.out.print("[" + i + "]" + clone[i] + " ");
        }

        Arrays.sort(clone);

        System.out.println();

        // foreach
        for(int x : clone) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(clone));
    }
}
