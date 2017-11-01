package lesson.lesson9.generics;

public class GenericData<T> {
    public String dataName;
    public int dataSize;

    public T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
