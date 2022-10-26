package home.HomeWork9;

public class UsbPort {
    private double typePort;
    private int idPort;

    public UsbPort(double typePort, int idPort) {
        this.typePort = typePort;
        this.idPort = idPort;
    }

    public double getTypePort() {
        return typePort;
    }

    public void setTypePort(double typePort) {
        this.typePort = typePort;
    }

    public int getIdPort() {
        return idPort;
    }

    public void setIdPort(int idPort) {
        this.idPort = idPort;
    }
}
