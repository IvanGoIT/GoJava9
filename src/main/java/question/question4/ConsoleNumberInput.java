package question.question4;

import java.util.Scanner;

public class ConsoleNumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        String line = scanner.nextLine();
        String[] numbers = line.split ( " " );

        int[] realNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            try {
                realNumbers[i] = Integer.parseInt ( numbers[i] );
            } catch (Exception e) {
                // обработка
                System.out.println(numbers[i] + " Это не число!!!");
            }
            // продолжение
        }
        for (int realNumber : realNumbers) {
            System.out.println ( realNumber );
        }
        System.out.println ();
        System.out.println ( "Your array size is :" + realNumbers.length );
    }
}
