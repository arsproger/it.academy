package month3.Task6;

public class Turtle implements Swimmable, LayEggs, WearArmor {
    private String name;
    private String type;
    private double weigth;

    public Turtle(String name, String type, double weigth) {
        this.name = name;
        this.type = type;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    @Override
    public void layEggs() {
        System.out.println("I am lay eggs");
    }

    @Override
    public void swimming() {
        System.out.println("I am swimming");
    }

    @Override
    public void wearArmor() {
        System.out.println("I am wear armor");
    }
}
