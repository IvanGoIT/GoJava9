package question.question3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReadingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] numbers = line.split(" ");

        int[] realNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            realNumbers[i] = Integer.parseInt(numbers[i]);
        }

        Arrays.sort(numbers);
        Arrays.sort(realNumbers);

        for (int realNumber : realNumbers){
            System.out.println(realNumber);
        }

        System.out.println();

        for (String number : numbers){
            System.out.println(number);
        }
    }
}
