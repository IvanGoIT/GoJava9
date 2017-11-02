package question.question10.history;

import java.util.ArrayList;

public class Price {

    public ArrayList<Double> history = new ArrayList<>();

    void setPrice(double price) {
        if (getPrice() != price)
            history.add(price);
    }

    double getPrice() {
        if (history.isEmpty()) return 0;
        return history.get(history.size() - 1);
    }

    @Override
    public String toString() {
        return "Price{" +
                "history=" + history +
                '}';
    }
}
