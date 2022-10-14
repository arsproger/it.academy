package practice.FreeCode.Task18;

public class Student extends Human {
    String nameGroup;

    public Student(String name, String nameGroup) {
        super(name);
        this.nameGroup = nameGroup;
    }
    public String getNameGroup() {
        return nameGroup;
    }
    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }
    public void printInfo() {
        System.out.println("Этот человек с именем: " + name);
        System.out.println("Этот человек с именем: " + name);
    }
}
