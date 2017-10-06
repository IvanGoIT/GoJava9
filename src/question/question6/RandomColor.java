package question.question6;

import javafx.scene.paint.Color;

import java.util.Random;

public class RandomColor {
    private static final Random r = new Random();

    public static double random(double min, double max) {
        return min + Math.random() * (max - min);
    }

    public static Color getRandom() {
        return Color.color(r.nextDouble(), r.nextDouble(), r.nextDouble());
    }

    public static void main(String[] args) {

        for(int i = 0; i < 100; i++) {
            double value = random(100, 200);

            if (value > 200)
                System.err.println("random = " + value);
            else
                System.out.println("random = " + value);
        }



//        System.out.println(getRandom());
//        System.out.println(getRandom());
//        System.out.println(getRandom());
//        System.out.println(getRandom());
//        System.out.println(getRandom());
    }
}
