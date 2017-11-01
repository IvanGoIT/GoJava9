package lesson.lesson5;

import lesson.lesson5.clock.Rolex;
import lesson.lesson5.clock.utils.Gear;

public class SecondMain {
    public static void main(String[] args) {
        Rolex rolex = new Rolex("0045487s12fsasw",
                new Gear[] {
                        new Gear("silver", 15),
                        new Gear("silver", 5),
                        new Gear("metal", 1),
                        new Gear("gold", 7),
                        new Gear("silver", 9)
                });

        rolex.show();
    }
}
