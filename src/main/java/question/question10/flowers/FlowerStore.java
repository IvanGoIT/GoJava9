package question.question10.flowers;

import lesson.lesson8.files.MyFileReader;
import lesson.lesson8.files.MyFileWriter;

import java.util.ArrayList;

public class FlowerStore {
    private static final String SEPARATOR = ";";

    public ArrayList<Flower> flowers = new ArrayList<>();

    private String getPricesPath(String filePath) {
        int index = filePath.lastIndexOf("/");
        String firstPart = filePath.substring(0, index + 1);
        String secondPart = filePath.substring(index + 1, filePath.length());
        return firstPart + "prices_" + secondPart;
    }

    public void save(String filePath) {
        String filePricesPath = getPricesPath(filePath);

        MyFileWriter dataWriter = new MyFileWriter(filePath);
        MyFileWriter dataPricesWriter = new MyFileWriter(filePricesPath);

        String names = "";
        for(Flower flower : flowers) {
            names += flower.name + SEPARATOR;
        }
        dataWriter.write(names);

        String prices = "";
        for(Flower flower : flowers) {
            prices += flower.price + SEPARATOR;
        }
        dataPricesWriter.write(prices);
    }

    public void load(String filePath) {
        String filePricesPath = getPricesPath(filePath);

        MyFileReader dataReader = new MyFileReader(filePath);
        MyFileReader dataPricesReader = new MyFileReader(filePricesPath);

        String names = dataReader.readLines(1);
        String prices = dataPricesReader.readLines(1);

        String[] arrayNames = names.split(SEPARATOR);
        String[] arrayPrices = prices.split(SEPARATOR);

        flowers.clear();

        for(int i = 0; i < arrayNames.length - 1; i++) {
            flowers.add(new Flower(arrayNames[i], Double.parseDouble(arrayPrices[i])));
        }
    }

    @Override
    public String toString() {
        return "FlowerStore{" +
                "flowers=" + flowers +
                '}';
    }
}
