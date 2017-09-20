package lesson.lesson4;

public class Program {

    static void sayHello(int x, int y, String str) {
        System.out.println("Hello! x = " + x);
        System.out.println("Hello 2! y = " + y);
        System.out.println("Hello 3! str = " + str);
        System.out.println("Hello 4!");
        System.out.println("Bye!");
    }

    static int calculation(int a, int b, int c) { // a^b + c
        return (int) Math.pow(a, b) + c;
    }

    static String drawRectangle(int width, int height, char c) {
        String result = "";
        for(int i = 0; i < height; i++) {
            String line = "";
            for(int j = 0; j < width; j++) {
                line += c;
            }
            result += line + "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        // sayHello(10, 25, "text");
        // ===================================

        // int x = calculation(2, 2, 3);
        // System.out.println("X = " + x);

        // ===================================

        System.out.println(drawRectangle(3, 4, '+'));
        System.out.println(drawRectangle(5, 2, '='));
        System.out.println(drawRectangle(2, 3, '&'));
    }
}
