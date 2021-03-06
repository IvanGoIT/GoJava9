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
        drawTriangle(8);
        System.out.println(generateTriangle(8));

        new CircleDrawer(8).draw();
        new CircleDrawer(3).draw();
        new CircleDrawer(15).draw();

//        Car superCar = new Car();   // OK
//        superCar.openDoor();
//
//        Car superCar = new Car();   // НЕ ОК
//        Car.openDoor(superCar);
    }
}
