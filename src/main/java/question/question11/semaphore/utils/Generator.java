package question.question11.semaphore.utils;

import question.question11.semaphore.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Generator {

    final static String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
    final static String numbers = "123457890".toLowerCase();

    final static java.util.Random rand = new java.util.Random();

    public static String randomIp() {
        return randomIdentifier(numbers, 1, 2) + "." +
                randomIdentifier(numbers, 1, 2) + "." +
                randomIdentifier(numbers, 1, 2) + "." +
                randomIdentifier(numbers, 1, 2);
    }

    public static String randomName() {
        return randomIdentifier(lexicon, 5, 7);
    }

    public static String randomIdentifier(String str, int min, int max) {
        StringBuilder builder = new StringBuilder();
        while(builder.toString().length() == 0) {
            int length = rand.nextInt(max - min) + min;
            for(int i = 0; i < length; i++) {
                builder.append(str.charAt(rand.nextInt(str.length())));
            }
        }
        return builder.toString();
    }

    public static ArrayList<User> generateUsers(int count) {
        ArrayList<User> users = new ArrayList<>(count);
        for(int i = 0; i < count; i++) {
            users.add(new User(Generator.randomName(), Generator.randomIp()));
        }
        return users;
    }
}
