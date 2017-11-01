package lesson.lesson10.enumeration;

public class EnumExample {
    public static void main(String[] args) {
        User u1 = new User("user000", Gender.female, 0);
        User u2 = new User("user001", Gender.male, 0);
        User u3 = new User("user002", Gender.unknown, 0);
    }
}
