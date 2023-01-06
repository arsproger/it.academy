package subject.freeCode.Task18;

public class Teacher extends Human {
    String nameTask;
    public Teacher(String name, String nameTask) {
        super(name);
        this.nameTask = nameTask;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }
    public void printInfo() {
        System.out.println("Этот человек с именем: " + name);
        System.out.println("Этот человек с именем: " + name);
    }
}
