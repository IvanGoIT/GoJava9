package question.question11.semaphore;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Room {
    private static final int MAX_COUNT_OF_USERS = 12;

    private String name;
    private Semaphore semaphore = new Semaphore(MAX_COUNT_OF_USERS);
    private ArrayList<User> users = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    public void login(User user) throws InterruptedException {

        System.out.println(user.getName() + " \t\t" + user.getIp() + " trying to log in \t\t" + "available slots: " + semaphore.availablePermits() + "\ttime:" + System.currentTimeMillis());
        semaphore.acquire(); // забронировали слот в семафоре. Либо ждем освобождения слота
        users.add(user);
        System.out.println(user.getName() + " \t\t" + user.getIp() + " logged in \t\t\t\t" + "available slots: " + semaphore.availablePermits() + "\ttime:" + System.currentTimeMillis());
    }

    public void logout(User user) throws InterruptedException {
        System.out.println(user.getName() + " \t\t" + user.getIp() + " is going to log out \t" + "available slots: " + semaphore.availablePermits() + "\ttime:" + System.currentTimeMillis());
        users.remove(user);
        semaphore.release(); // освобождаем слот
        System.out.println(user.getName() + " \t\t" + user.getIp() + " logged out \t\t\t\t" + "available slots: " + semaphore.availablePermits() + "\ttime:" + System.currentTimeMillis());
    }
}
