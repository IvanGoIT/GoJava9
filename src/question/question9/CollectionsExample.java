package question.question9;

import lesson.lesson5.animal.Dog;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsExample {

    private static final int BEAGLE = 0;
    private static final int ROTTWEILER = 1;

    public static void main(String[] args) {
        ArrayList<ArrayList<Dog>> dogs = new ArrayList<>();

        dogs.add(new ArrayList<Dog>()); // бигли        [0]
        dogs.add(new ArrayList<Dog>()); // ротвейлер    [1]

        dogs.get(BEAGLE).add(new Dog());
        dogs.get(BEAGLE).add(new Dog());

        dogs.get(ROTTWEILER).add(new Dog());
        dogs.get(ROTTWEILER).add(new Dog());



        HashMap<String, ArrayList<Dog>> niceDogs = new HashMap<>();

        niceDogs.put("BEAGLE", new ArrayList<Dog>());
        niceDogs.put("ROTTWEILER", new ArrayList<Dog>());

        niceDogs.get("BEAGLE").add(new Dog());
        niceDogs.get("BEAGLE").add(new Dog());
        niceDogs.get("BEAGLE").add(new Dog());
        niceDogs.get("BEAGLE").add(new Dog());

        Dog dog = niceDogs.get("BEAGLE").get(2);



        HashMap<String, HashMap<String, ArrayList<Dog>>> groupGroupDogs = new HashMap<>();
        // groupGroupDogs.get("ROTTWEILER").get("RED").get(2); // example
    }
}
