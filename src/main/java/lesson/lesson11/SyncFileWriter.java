package lesson.lesson11;

import lesson.lesson8.files.MyFileWriter;

import java.util.concurrent.Semaphore;

public class SyncFileWriter extends MyFileWriter {
    private Semaphore semaphore = new Semaphore(1);

    public SyncFileWriter(String path) {
        super(path);
    }

    public SyncFileWriter(String path, boolean append) {
        super(path, append);
    }

    @Override
    public void write(String text) {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        super.write(text);

        semaphore.release();
    }
}
