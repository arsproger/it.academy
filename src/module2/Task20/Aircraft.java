package module2.Task20;

public abstract class Aircraft {
    private int id;
    private String model;
    private AircraftType type;
    private static int count = 1;

    public Aircraft(String model, AircraftType type) {
        this.id = count;
        count++;
        this.model = model;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public AircraftType getType() {
        return type;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Aircraft: " +
                "id = " + id +
                ", model = '" + model + '\'' +
                ", type = '" + type + '\'' +
                ';';
    }
}
