package module3.Task7;

public class Pipe implements MusicTools {
    private double diametr;

    public Pipe(double diametr) {
        this.diametr = diametr;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("Играет инструмент труба с диаметром " + this.diametr);
    }
}
