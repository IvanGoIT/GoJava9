package question.question6;

import javafx.scene.paint.Color;

import java.util.Random;

public class RandomColor {
    private static final Random r = new Random();

    public static Color getRandom() {
        return Color.color(r.nextDouble(), r.nextDouble(), r.nextDouble());
    }

    public static void main(String[] args) {
        System.out.println(getRandom());
        System.out.println(getRandom());
        System.out.println(getRandom());
        System.out.println(getRandom());
        System.out.println(getRandom());
    }
}
