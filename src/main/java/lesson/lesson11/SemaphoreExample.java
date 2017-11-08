package lesson.lesson11;

import lesson.lesson8.files.MyFileWriter;

public class SemaphoreExample {
    public static void main(String[] args) {
        MyFileWriter syncFileWriter = new SyncFileWriter("files/lesson11/file.txt", true);

        new Thread(() -> syncFileWriter.write(Thread.currentThread().getName() + "\n")).start();
        new Thread(() -> syncFileWriter.write(Thread.currentThread().getName() + "\n")).start();
        new Thread(() -> syncFileWriter.write(Thread.currentThread().getName() + "\n")).start();
    }
}
