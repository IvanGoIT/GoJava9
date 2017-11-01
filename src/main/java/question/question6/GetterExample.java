package question.question6;

import lesson.lesson4.Recursion;

public class GetterExample {
    private int n;
    private int factorial;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
        factorial = Recursion.fact(n);
    }

    public int getFactorial() {
        return factorial;
    }
}
