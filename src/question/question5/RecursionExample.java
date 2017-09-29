package question.question5;

import question.question5.utils.CircleDrawer;

public class RecursionExample {

    // -- 5
    //  +
    //  ++
    //  +++
    //  ++++
    //  +++++



    private static void drawTriangle(int x) {
        if (x > 0) {
            drawTriangle(x - 1);
            for(int i = 0; i < x; i++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    private static String generateTriangle(int x) {
        String result = "";
        if (x > 0) {
            result += generateTriangle(x - 1);
            for(int i = 0; i < x; i++) {
                result += "+";
            }
            result += "\n";
        }
        return result;
    }



    public static void main(String[] args) {
        // drawTriangle(8);
        // System.out.println(generateTriangle(8));

        CircleDrawer circleDrawer = new CircleDrawer(8);
        circleDrawer.draw();
    }
}
