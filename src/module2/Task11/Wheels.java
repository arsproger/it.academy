package module2.Task11;

public class Wheels {
      private String name;
      private double radius;
      private String typeOfSeason;

    public Wheels(String name, double radius, String typeOfSeason) {
        this.name = name;
        this.radius = radius;
        this.typeOfSeason = typeOfSeason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getTypeOfSeason() {
        return typeOfSeason;
    }

    public void setTypeOfSeason(String typeOfSeason) {
        this.typeOfSeason = typeOfSeason;
    }

    @Override
    public String toString() {
        return "\nWheels{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", typeOfSeason='" + typeOfSeason + '\'' +
                '}';
    }
}
