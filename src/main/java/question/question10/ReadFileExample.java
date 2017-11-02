package question.question10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("files/questions10/delimiter.txt"));
        scanner = scanner.useDelimiter("\\Z");

        while(scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
