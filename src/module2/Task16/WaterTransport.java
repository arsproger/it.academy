package module2.Task16;

public class WaterTransport extends Transport {
    private String nameType;

    public WaterTransport() {
    }

    public WaterTransport(String nameType) {
        this.nameType = nameType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }
}
