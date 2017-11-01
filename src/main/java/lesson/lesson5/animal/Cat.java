package lesson.lesson5.animal;

import lesson.lesson5.animal.data.DataName;

public class Cat {
    public Name name = new Name();
    public DataName dataName = new DataName();

    public static class Name {
        public String firstName;
        public String lastName;
    }

    public void show() {
        System.out.println(name.firstName + "\t" + name.lastName);
        System.out.println(dataName.firstName + "\t" + dataName.lastName);
    }
}
