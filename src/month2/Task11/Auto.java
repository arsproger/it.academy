package month2.Task11;

public class Auto {
    private String name;
    private Engine engine;
    private Wheels wheels;
    private Music music;

    public Auto(String name, Engine engine, Wheels wheels, Music music) {
        this.name = name;
        this.engine = engine;
        this.wheels = wheels;
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                ", music=" + music +
                '}';
    }
}
