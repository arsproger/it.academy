package subject.freeCode.Test;

public class Main2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ольга Александровна", "Математика");
        Student student = new Student("Максим");
        teacher.evaluate(student);
    }
}
