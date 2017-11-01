package lesson.lesson8.products;

public class SuperProduct {
    private int id;
    private String name;

    public SuperProduct(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println("\n[" + id + "] " + name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
