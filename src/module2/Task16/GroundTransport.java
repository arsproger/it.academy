package module2.Task16;

public class GroundTransport extends Transport {
    private String nameType;

    public GroundTransport() {
    }

    public GroundTransport(String nameType) {
        this.nameType = nameType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }
}
