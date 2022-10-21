package practice.FreeCode.Taks25;

public class Drum implements Tool {
    int size;
    public Drum(int size) {
        this.size = size;
    }
    @Override
    public void play() {
        System.out.println("Играет инструмент барабан, с размером " + size);
    }
}
