package home.HomeWork10;

public abstract class Shape {
    private char symbol;

    public Shape(char symbol) {
        this.symbol = symbol;
    }
    abstract void draw();

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
