package lesson.lesson8.files;

public class FilesExample {
    public static void main(String[] args) {
        MyFileReader reader = new MyFileReader("files/lesson8/data.txt");
        reader.printFile();

        System.out.println(reader.readLines(3));

        System.out.println();
        System.out.println();

        MyFileWriter writer = new MyFileWriter("files/lesson8/dataNew.txt");
        writer.write("мой новый текст\n11111111");

        MyFileReader reader2 = new MyFileReader("files/lesson8/dataNew.txt");
        reader2.printFile();
    }
}
