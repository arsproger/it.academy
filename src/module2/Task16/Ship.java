package module2.Task16;

public class Ship extends WaterTransport{
    private String nameAuto;

    public Ship() {

    }

    public String getNameAuto() {
        return nameAuto;
    }

    public void setNameAuto(String nameAuto) {
        this.nameAuto = nameAuto;
    }

    public Ship(String nameAuto) {
        this.nameAuto = nameAuto;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "nameAuto='" + nameAuto + '\'' +
                '}';
    }

    public Ship(String nameType, String nameAuto) {
        super(nameType);
        this.nameAuto = nameAuto;
    }
}
