package home.HomeWork10;

public class Triangle extends Shape {

    public Triangle(char symbol) {
        super(symbol);
    }

    @Override
    void draw() {
        System.out.print("      " + this.getSymbol() + "\n");
        System.out.print("    " + this.getSymbol());
        for (int i = 0; i < 3; i++) { System.out.print(" "); }
        System.out.print(this.getSymbol() + "\n");
        System.out.print("   " + this.getSymbol());
        for (int i = 0; i < 5; i++) { System.out.print(" "); }
        System.out.print(this.getSymbol() + "\n");
        System.out.print("  " + this.getSymbol());
        for (int i = 0; i < 7; i++) { System.out.print(" "); }
        System.out.print(this.getSymbol() + "\n");
        System.out.print(" " + this.getSymbol());
        for (int i = 0; i < 9; i++) { System.out.print(" "); }
        System.out.print(this.getSymbol() + "\n");
        for (int i = 0; i < 5; i++) { System.out.print(this.getSymbol() + "  "); }
    }
}
