package module2.Task16;

public class UndergroundTransport extends Transport {
    private String nameType;

    public UndergroundTransport() {
    }

    public UndergroundTransport(String nameType) {
        this.nameType = nameType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }
}
