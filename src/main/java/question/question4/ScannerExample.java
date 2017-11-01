package question.question4;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt(); scanner.nextLine();
        String l = scanner.nextLine();

        float f = scanner.nextFloat();
        double d = scanner.nextDouble();

        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);


        for(int index = 0; index < 10; index++) {
            if(scanner.hasNextInt()) {
                int value = scanner.nextInt();
                System.out.print(" value(int) = " + value);
            } else {
                String value = scanner.next();
                System.out.print(" value(str) = " + value);
            }
        }

        scanner.close();
    }
}
