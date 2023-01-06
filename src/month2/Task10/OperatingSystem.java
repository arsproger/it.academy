package month2.Task10;

public class OperatingSystem {
     private String title;
     private double version;

    public OperatingSystem(String title, double version) {
        this.title = title;
        this.version = version;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Операционная система{" +
                "Титл='" + title + '\'' +
                ", Версия=" + version +
                '}';
    }
}
