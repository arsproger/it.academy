package module2.Task16;

public class Airplane extends AirTransport{
    private String nameAuto;

    public Airplane(String nameAuto) {
        this.nameAuto = nameAuto;
    }

    public Airplane(String nameType, String nameAuto) {
        super(nameType);
        this.nameAuto = nameAuto;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "nameAuto='" + nameAuto + '\'' +
                '}';
    }

    public Airplane() {

    }
}
