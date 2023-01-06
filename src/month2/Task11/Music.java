package month2.Task11;

public class Music {
    private String name;

    public Music(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nMusic{" +
                "name='" + name + '\'' +
                '}';
    }
}
