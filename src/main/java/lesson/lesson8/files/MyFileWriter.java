package lesson.lesson8.files;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter extends SuperFile {
    public MyFileWriter(String path) {
        super(path);
    }

    public void write(String text) {
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(text);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
