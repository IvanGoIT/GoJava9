package question.question5.utils;


public class CircleDrawer {
    private final int size;

    public CircleDrawer(int size) {
        this.size = size;
    }

    private void drawLine(int x, int offset) {
        for(int i = 0; i < offset; i++)
            System.out.print(" ");

        for(int i = 0; i < x * 2; i++)
            System.out.print(" +");

        System.out.println();
    }

    private void drawPyramid(int x) {
        if (x > 0) {
            drawPyramid(x - 1);
            drawLine(x, size - x);
        }
    }

    private void drawPyramidReverse(int x) {
        if (x > 0) {
            drawLine(x, size - x);
            drawPyramidReverse(x - 1);
        }
    }

    public void draw() {
        if (size % 2 == 0){
            drawPyramid(size / 2);
            drawPyramidReverse(size / 2);
        }
        else {
            drawPyramid(size / 2);
            drawPyramidReverse((size / 2) - 1);
        }
    }
}
