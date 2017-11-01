package lesson.lesson5.clock;

import lesson.lesson5.clock.utils.Gear;

public class Rolex {
    private String serialNumber = "default";
    private Gear[] gears;

    public Rolex(String serialNumber, Gear[] gears) {
        this.serialNumber = serialNumber;
        this.gears = gears;
    }

    public void show() {
        System.out.println("Serial Number: \t" + serialNumber);
        for (Gear gear : gears) {
            gear.show();
        }
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Gear[] getGears() {
        return gears;
    }

    public void setGears(Gear[] gears) {
        this.gears = gears;
    }
}
