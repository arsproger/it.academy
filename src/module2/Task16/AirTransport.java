package module2.Task16;

public class AirTransport extends Transport {
    private String nameType;

    public AirTransport() {
    }

    public AirTransport(String nameType) {
        this.nameType = nameType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }
}
