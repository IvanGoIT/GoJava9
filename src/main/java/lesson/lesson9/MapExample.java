package lesson.lesson9;

import question.question5.utils.Dog;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> commands = new HashMap<>();

        commands.put("-h", "help command");
        commands.put("-i", "info about the program command");
        commands.put("-o", "option command");
        commands.put("-q", "quit command");


        String command = "-i";
        System.out.println(commands.get(command));

        HashMap<String, Dog> dogs = new HashMap<>();
        dogs.put("долматинец", new Dog("barsik", 19));
        dogs.put("кокер", new Dog("barsik2", 19));
        dogs.put("кокер", new Dog("barsik100", 19));

        for(String type : dogs.keySet()) {
            System.out.println(dogs.get(type).getName());
        }
    }
}
