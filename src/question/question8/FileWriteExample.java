package question.question8;

import lesson.lesson7.animal.simple.BaseAnimal;
import lesson.lesson7.animal.simple.Cat;
import lesson.lesson7.animal.simple.Snake;

import java.io.*;

public class FileWriteExample {
    private static final String FILE = "animals_data.txt";
    private static final String PATH = "files/question8/" + FILE;

    private static final String SEPARATOR = ";";

    static void saveAnimals(BaseAnimal[] animals) {
        try {
            FileWriter writer = new FileWriter(PATH);

            writer.write("" + animals.length + "\n");

            for(BaseAnimal animal : animals) {
                writer.write(animal.getClass().getSimpleName() + SEPARATOR);
                writer.write(animal.getName() + SEPARATOR);
                writer.write(animal.getAge() + SEPARATOR);
                writer.write(animal.getWeight() + SEPARATOR);

                if (animal instanceof Snake) {
                    Snake snake = (Snake) animal;
                    writer.write(snake.getLength() + SEPARATOR);
                }
                writer.write("\n");
            }

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static BaseAnimal[] loadAnimals() {
        try {
            FileReader reader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(reader);

            int count = Integer.parseInt(bufferedReader.readLine());
            BaseAnimal[] animals = new BaseAnimal[count];

            for(int i = 0; i < animals.length; i++) {
                String line = bufferedReader.readLine();
                String[] data = line.split(SEPARATOR);

                String className = data[0];
                String animalName = data[1];
                int animalAge = Integer.parseInt(data[2]);
                float animalWeight = Float.parseFloat(data[3]);

                if (className.equals(Cat.class.getSimpleName())) {
                    animals[i] = new Cat(animalName, animalAge, animalWeight);
                }
                if (className.equals(Snake.class.getSimpleName())) {
                    float length = Float.parseFloat(data[4]);
                    animals[i] = new Snake(animalName, animalAge, animalWeight, length);
                }
            }
            return animals;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    static void printAnimals(BaseAnimal[] animals) {
        for (BaseAnimal animal : animals) {
            System.out.println();
            System.out.println(animal.getName());
            System.out.println(animal.getAge());
            System.out.println(animal.getWeight());

            if (animal instanceof Snake) {
                Snake snake = (Snake) animal;
                System.out.println(snake.getLength());
            }
        }
    }

    public static void main(String[] args) {
        BaseAnimal[]animals = new BaseAnimal[] {
                new Cat("Kitty", 2, 3),
                new Snake("Snake", 20, 12, 10)
        };
        saveAnimals(animals);

        animals = null;

        animals = loadAnimals();
        printAnimals(animals);
    }
}
