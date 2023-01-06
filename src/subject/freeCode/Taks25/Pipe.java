package subject.freeCode.Taks25;

public class Pipe implements Tool {
    int diameter;
    public Pipe(int diameter) {
        this.diameter = diameter;
    }
    @Override
    public void play() {
        System.out.println("Играет инструмент труба, с диаметром " + diameter);
    }
}
