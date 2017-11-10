package question.question11.semaphore;

import question.question11.semaphore.utils.Generator;

import java.util.ArrayList;

public class Lobby {
    private Room room;

    public Lobby(String name) {
        room = new Room(name);
    }

    public void loginAll(ArrayList<User> users) {
        for(User user : users) {
            final User tempUser = user;
            new Thread(() -> {
                try {
                    room.login(tempUser);
                    Thread.sleep(5000); // пользователь играет какое-то время
                    room.logout(tempUser);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
