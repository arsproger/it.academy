package month2.Task10;

public class Ram {
    private int size;
    private String model;

    public Ram(int size, String model) {
        this.size = size;
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Операционная память{" +
                "Размер=" + size +
                ", Модель='" + model + '\'' +
                '}';
    }
}
