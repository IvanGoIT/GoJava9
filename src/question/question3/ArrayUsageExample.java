package question.question3;

import javafx.scene.shape.Circle;

public class ArrayUsageExample {
    public static void main(String[] args) {
        Circle[] circles = new Circle[10];

        for(int i = 0; i < circles.length; i++) {
            float x = 10 * i;
            float y = 20 * i;
            float r = 5;
            circles[i] = new Circle(x, y, r);
        }
    }
}
