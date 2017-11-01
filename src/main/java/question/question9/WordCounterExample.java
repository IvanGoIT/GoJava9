package question.question9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class WordCounterExample {

    static String clearText(String text) {
        return text.toLowerCase()
                .replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll("\n", "")
                .replaceAll("\r", "");
    }

    static SortedMap<String, Integer> calcWordRepeats(String text) {
        SortedMap<String, Integer> result = new TreeMap<>();

        String[] words = text.split(" ");

        for(String word : words) {
            int oldValue = result.getOrDefault(word, 0);
            result.put(word, oldValue + 1);
        }

        return result;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String dirtyText = new Scanner(new File("files/question9/text.txt")).useDelimiter("\\Z").next();
        String clearText = clearText(dirtyText);

        SortedMap<String, Integer> result = calcWordRepeats(clearText);

        for(String word : result.keySet()) {
            int count = result.get(word);
            System.out.println("" + count + "\t\t\t\t" + word);
        }

        // System.out.println(dirtyText);
    }
}
