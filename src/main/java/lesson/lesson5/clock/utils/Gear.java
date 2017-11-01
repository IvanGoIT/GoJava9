package lesson.lesson5.clock.utils;

public class Gear {
    private String metalType = "gold";
    private float radius = 1f;

    public Gear(String metalType, float radius) {
        this.metalType = metalType;
        this.radius = radius;
    }

    public void show() {
        System.out.println("\tmetal type: \t" + metalType);
        System.out.println("\tradius: \t\t" + radius);
    }

    public String getMetalType() {
        return metalType;
    }

    public void setMetalType(String metalType) {
        this.metalType = metalType;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
