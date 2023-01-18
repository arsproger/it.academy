import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hero> list = new ArrayList<>();
        list.add(new Hero(5, "E"));
        list.add(new Hero(3, "C"));
        list.add(new Hero(1, "A"));
        list.add(new Hero(4, "D"));
        list.add(new Hero(2, "B"));
        System.out.println(list);
//        list.sort(Comparator.comparing(Hero::getName));
        list.sort((s1, s2) -> {
            return s1.getId() - s2.getId();
        });

        list.sort((o1, o2) -> 0);
        System.out.println(list);
        String n = "AbstractAnnotationConfigDispatcherServletInitializer";
        System.out.println(n.length());
    }
}

class Hero {
    public Hero(int id, String name) {
        this.id = id;
        this.name = name;
    }
    private int id;
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}