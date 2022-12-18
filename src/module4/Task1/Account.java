package module4.Task1;

public class Account <T> {
    private T text;

    public Account(T text) {
        this.text = text;
    }

    public T getText() {
        return text;
    }

    public void setText(T text) {
        this.text = text;
    }
}
