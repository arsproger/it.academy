package module2.Task17;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void info();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
