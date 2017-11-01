package question.question2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1234    -- число
        // 1 2 3 4 -- цифры

        // % - деление по модулю

        int x = 123;
        System.out.println("III = " + (x % 10));

        x = x / 10;
        System.out.println("II  = " + (x % 10));

        x = x / 10;
        System.out.println("I   = " + (x % 10));

        // ----------------------------------------------
        // System.out.printf

        // println x конец строки
        System.out.println("println " + x + " конец строки");
        System.out.printf("printf %d конец строки\n", x);

        // ----------------------------------------------
        // деление по модулю

        int y = 1234;

        int m = y % 10; // последняя цифра
        boolean multiple3 = y % 3 == 0;
        boolean multiple10 = y % 10 == 0;
        boolean multiple4 = y % 4 == 0;
        boolean multiple2 = y % 2 == 0;

        System.out.println("Кратно 3  " + multiple3);
        System.out.println("Кратно 10 " + multiple10);
        System.out.println("Кратно 4  " + multiple4);
        System.out.println("Кратно 2  " + multiple2);

        // ----------------------------------------------

        // 0 1 2 3 4 5 6 7 8 9  десятеричная
        // 0 1                  двоичная
        int n = 10;
        // 00000000000000000000000000001010   -- десятеричная десятка
        // 00000000000000000000000000000001   -- десятеричная еденица

        // 00000000000000000000000000000001
        // результат << 3
        // 00000000000000000000000000001000

        // 00000000000000000000000000001010
        // 00000000000000000000000000001000   -- десятеричная восьмерка
        // результат И - &
        // 00000000000000000000000000001000
        // результат >> 3
        // 00000000000000000000000000000001

        System.out.println("1 << 33 = " + (1 << 33));
        System.out.println("1 >> 5 = " + (1 >> 5));
        int fourthBitFromRight =(n & (1 << 3)) >> 3;

        // ---------------------------------------------
        // Scanner

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите int");
        int variable = scanner.nextInt(); // scanner.nextLine();

        System.out.println("Введите string");
        String str = scanner.nextLine();


        System.out.println("int    = " + variable);
        System.out.println("string = " + str);

        // ---------------------------------------------
        // BufferReader

        // пример 1
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        // пример 2 - эквивалент
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
    }
}
