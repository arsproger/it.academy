package module2.Task16;

public class Auto extends Car{
    private String nameAuto;

    @Override
    public String toString() {
        return "Auto{" +
                "nameAuto='" + nameAuto + '\'' +
                '}';
    }

    public String getNameAuto() {
        return nameAuto;
    }

    public void setNameAuto(String nameAuto) {
        this.nameAuto = nameAuto;
    }

    public Auto() {
    }

    public Auto(String nameAuto) {
        this.nameAuto = nameAuto;
    }
}
