package question.question11.semaphore;

import question.question11.semaphore.utils.Generator;

public class SemaphoreExample {
    public static void main(String[] args) {
        Lobby lobby = new Lobby("Lobby 1");
        lobby.loginAll(Generator.generateUsers(20));
    }
}
